import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PANTALLA_JUEGO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PANTALLA_JUEGO extends World
{

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
    
    public void started (){
    
        addObject(new Av1(), 80, 400);
        addObject(new Av2(), 1050, 600);
        addObject(new Av3(), 900, 400);
        addObject(new Av4(), 750, 300);
        addObject(new Bala(), 80,100);
        addObject(new Misil(), 80,100);
        
            
    }
}
