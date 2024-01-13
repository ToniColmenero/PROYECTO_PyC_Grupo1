import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class teledirigido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teledirigido extends atqmalos
{
    /**
     * Act - do whatever the teledirigido wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Av1.y>getY())
        {
            setLocation( getX(), getY()+2);
        }
        if(Av1.y<getY())
        {
            setLocation( getX(), getY()-2);
        }
        super.act();
    }
}
