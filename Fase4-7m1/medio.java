import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class medio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class medio extends Actor
{
    /**
     * Act - do whatever the medio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            PANTALLA_MENÚ.SetDificultad(1);
        }
    }
}
