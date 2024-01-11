import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PANTALLA_MENÚ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PANTALLA_MENÚ extends World
{
    public GreenfootSound Inicio= new GreenfootSound("inicio.mp3");
    /**
     * Constructor for objects of class PANTALLA_MENÚ.
     * 
     */
    public PANTALLA_MENÚ()
    {    
        super(1200, 710, 1); 
        
        setBackground("Menu.jpeg");
        
        Inicio.play();
        
        addObject(new Boton(), 630, 410);  
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(Boton.class))
        {
            Inicio.stop();
            Greenfoot.setWorld(new PANTALLA_JUEGO()); 
            
        }
    }
    
}
