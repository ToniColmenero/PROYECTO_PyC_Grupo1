import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boton extends Actor
{
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            PANTALLA_MENÚ.Inicio.stop();
            Greenfoot.setWorld(new PANTALLA_JUEGO());
        }
    }
}
