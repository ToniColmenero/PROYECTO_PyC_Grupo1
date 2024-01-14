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
    private int timer = 2700;
    //public static GreenfootSound Juego= new GreenfootSound("musicajuego.mp3");
    /**
     * Constructor for objects of class PANTALLA_JUEGO.
     * 
     */
    public PANTALLA_JUEGO()
    {
        super(1200, 710, 1); 
        
        setBackground("FONDOJUEGO.jpg");
        
        //Juego.play();
        //Juego.setVolume(PANTALLA_MENÚ.volumen);
        started();
        
    }      
    
    public void act()
    {
        showText("Puntos: " + puntos, 60 , 30);
        
        showText("Vidas J1: " + Av1.vidasj1, 60, 60);
        if(Menu.j2==true)
        {
            showText("Vidas J2: " + Avj2.vidasj2, 180, 60);
        }
        showText("Tiempo: " + timer, 70,90);
        
        if (Av1.vidasj1<=0 && Avj2.vidasj2<=0)
        {
            //Juego.stop();
            Greenfoot.setWorld(new PANTALLA_GAMEOVER());
        }
        
        timer--;
        
        if (timer <= 0) {
            //Juego.stop();
            Greenfoot.setWorld(new PANTALLA_BOSS());
        }
    }
    public void started (){
        puntos = 0;
        Av1.vidasj1 =3;
        addObject(new Av1(), 80, 400);
        addObject(new Av2(), 1050, 600);
        addObject(new Av3(), 900, 700);
        addObject(new Av4(), 750, 300);
        if (Menu.j2==true)
        {
            addObject(new Avj2(), 80, 500);
            Avj2.vidasj2 =3;
        }
    }
    
}
