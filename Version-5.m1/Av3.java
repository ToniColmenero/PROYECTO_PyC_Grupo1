import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Av3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Av3 extends Malos
{
    /**
     * Act - do whatever the Av3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        if(atacante==1)
        {
            atacante=5;
            getWorld().addObject(new Misil(), getX(), getY());
        }
    }
}
