import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class metralla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class metralla extends atqmalos
{
    private int vx=2-Greenfoot.getRandomNumber(4);
    private int i=Greenfoot.getRandomNumber(2);
    private int vy=5-Greenfoot.getRandomNumber(11);
    public void act()
    {
        setLocation(getX()+vx,getY()+vy);
        super.act();
    }
}
