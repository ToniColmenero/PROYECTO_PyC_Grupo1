import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PANTALLA_MENÚ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PANTALLA_MENÚ extends World
{

    /**
     * Constructor for objects of class PANTALLA_MENÚ.
     * 
     */
    public PANTALLA_MENÚ()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 710, 1); 
        
        setBackground("Menu.jpeg");
        addObject(new Boton(), 630, 410);
        
        
        
              
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(Boton.class))
        {
            Greenfoot.setWorld(new PANTALLA_JUEGO()); 
        }
    }
}
