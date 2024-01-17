import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class desafio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class desafio extends Menu
{
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            //PANTALLA_MENÚ.Inicio.stop();
            Greenfoot.setWorld(new PANTALLA_BOSS());
        }
    }
}
