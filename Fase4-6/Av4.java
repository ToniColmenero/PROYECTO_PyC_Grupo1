import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Av4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Av4 extends Malos
{
    /**
     * Act - do whatever the Av4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        if(atacante==2)
        {
            atacante=5;
            getWorld().addObject(new Misil(), getX(), getY());
        }
    }
}
