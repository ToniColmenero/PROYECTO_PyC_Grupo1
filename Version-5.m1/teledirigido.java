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
     * Av1.y1
     * Avj2.y2
     * Avj3.y3
     */
    private int objetivo=Greenfoot.getRandomNumber(PANTALLA_MENÚ.jugadores);
    public void act()
    {
        //objetivo=Greenfoot.getRandomNumber(PANTALLA_MENÚ.jugadores);
        switch(objetivo)
        {
            case 0:
                if(Av1.vidas/*j1*/<=0){objetivo=2;}
                trackAv(Av1.y);
                break;
            case 1:
                if(Avj2.vidas<=0){objetivo=0;}
                trackAv(Avj2.y);
                break;
            case 2:
                if(Avj3.vidas<=0){objetivo=1;}
                trackAv(Avj3.y);
                break;
        }
        /*if(PANTALLA_MENÚ.jugadores==1)
        {
            trackAv(Av1.y1);
        } else {
            if(Av1.x1<Avj2.x2)
            {
                trackAv(Av1.y1);
            } else {
                trackAv(Avj2.y2);
            }
        }
        
        if(Av1.x1<Avj2.x2 && Av1.x1>=0)
            {
                trackAv(Av1.y1);
            } else {
                trackAv(Avj2.y2);
            }*/
        
        super.act();
    }
    private void trackAv(int Yav/*, int Xav*/)
    {
        if(Yav>getY())
            {
                setLocation( getX(), getY()+2);
            }
        if(Yav<getY())
        {
            setLocation( getX(), getY()-2);
        }
    }
}
