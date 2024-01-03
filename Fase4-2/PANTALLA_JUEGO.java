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
    
    /**
     * Constructor for objects of class PANTALLA_JUEGO.
     * 
     */
    public PANTALLA_JUEGO()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 710, 1); 
        
        setBackground("FONDOJUEGO.jpg");
    
        
    }      
    
    public void act()
    {
        showText("Puntos: " + puntos, 60 , 30);
        showText("Vidas: " + vidas, 60, 60);
        
        if (vidas==0)
        {
        Greenfoot.setWorld(new PANTALLA_GAMEOVER());
        }
        
    }
    public void started (){
        puntos = 0;
        vidas =3;
        addObject(new Av1(), 80, 400);
        addObject(new Av2(), 1050, 600);
        addObject(new Av3(), 900, 700);
        addObject(new Av4(), 750, 300);
        //addObject(new Bala(), 80,100);
        addObject(new Misil(), 800,500);
        
        
            
    }
    
}
