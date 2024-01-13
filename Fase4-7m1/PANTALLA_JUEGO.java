import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PANTALLA_JUEGO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PANTALLA_JUEGO extends World
{
    public static int puntos=0;
    public static int vidas=3;
    private int timer = 2700;
    GreenfootSound Juego= new GreenfootSound("musicajuego.mp3");
    /**
     * Constructor for objects of class PANTALLA_JUEGO.
     * 
     */
    public PANTALLA_JUEGO()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 710, 1); 
        
        setBackground("FONDOJUEGO.jpg");
        
        Juego.play();
        Juego.setVolume(PANTALLA_MENÚ.volumen);
        started();
        
    }      
    
    public void act()
    {
        showText("Puntos: " + puntos, 60 , 30);
        
        showText("Vidas: " + vidas, 60, 60);
        
        showText("Tiempo: " + timer, 60,90);
        
        if (vidas==0)
        {
            Juego.stop();
            Greenfoot.setWorld(new PANTALLA_GAMEOVER());
        }
        
        timer--;
        
        if (timer <= 0) {
            Juego.stop();
            Greenfoot.setWorld(new PANTALLA_VICTORIA());
        }
    }
    public void started (){
        puntos = 0;
        vidas =3;
        addObject(new Av1(), 80, 400);
        addObject(new Av2(), 1050, 600);
        addObject(new Av3(), 900, 700);
        addObject(new Av4(), 750, 300);  
    }
    
}
