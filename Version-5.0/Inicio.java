import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends Menu
{
    /**
     * Act - do whatever the Inicio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            PANTALLA_VICTORIA.Victoria.stop();
            PANTALLA_GAMEOVER.Derrota.stop();
            Greenfoot.setWorld(new PANTALLA_MENÚ());
        }
    }
}
