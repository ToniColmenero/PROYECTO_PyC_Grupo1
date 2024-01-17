import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hangar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PANTALLA_HANGAR extends World
{
    public static int divisas;
    public PANTALLA_HANGAR()
    {
        super(1200, 710, 1); 
        
        addObject(new Inicio(), 738, 338);
    }
    public void act()
    {
        showText("Divisas: "+ divisas, 60, 30);
    }
}
