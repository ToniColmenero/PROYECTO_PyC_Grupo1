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
        if(Menu.j2==false)
        {
            if(Av1.y1>getY())
            {
                setLocation( getX(), getY()+2);
            }
            if(Av1.y1<getY())
            {
                setLocation( getX(), getY()-2);
            }
        } else {
            if(Av1.x1<Avj2.x2)
            {
                if(Av1.y1>getY())
                {
                    setLocation( getX(), getY()+2);
                }
                if(Av1.y1<getY())
                {
                    setLocation( getX(), getY()-2);
                }
            } else {
                if(Avj2.y2>getY())
                {
                    setLocation( getX(), getY()+2);
                }
                if(Avj2.y2<getY())
                {
                    setLocation( getX(), getY()-2);
                }
            }
        }
        super.act();
    }
}
