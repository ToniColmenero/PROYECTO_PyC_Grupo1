import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class volmen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class volmen extends Actor
{
    /**
     * Act - do whatever the volmen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && PANTALLA_MENÚ.volumen>0)
        {
            PANTALLA_MENÚ.volumen = PANTALLA_MENÚ.volumen-10;
        }
    }
}
