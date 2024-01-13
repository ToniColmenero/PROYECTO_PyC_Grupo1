import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class racimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class racimo extends atqmalos
{
    private boolean dispo=true;
    public void act()
    {
        if(Av1.x+150>=getX() && dispo==true )
        {
            dispo=false;
            getWorld().addObject(new metralla(), getX(), getY());
            getWorld().addObject(new metralla(), getX(), getY());
            getWorld().addObject(new metralla(), getX(), getY());
        }
        super.act();
    }
}
