import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hanga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hangar extends Menu
{
    /**
     * Act - do whatever the hanga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            //PANTALLA_MENÚ.Inicio.stop();
            PANTALLA_VICTORIA.Victoria.stop();
            PANTALLA_GAMEOVER.Derrota.stop();
            Greenfoot.setWorld(new PANTALLA_HANGAR());
        }
    }
}
