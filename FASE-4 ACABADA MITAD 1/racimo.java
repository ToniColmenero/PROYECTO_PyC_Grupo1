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
    private int i=0;
    public void act()
    {
        if((Av1.x1+150>=getX() || Avj2.x2+150>=getX()) && dispo==true )
        {
            dispo=false;
            for(i=0;i<(int)(3*PANTALLA_MENÚ.dificultad);i++)
            {
                getWorld().addObject(new metralla(), getX(), getY());
            }
        }
        super.act();
    }
}
