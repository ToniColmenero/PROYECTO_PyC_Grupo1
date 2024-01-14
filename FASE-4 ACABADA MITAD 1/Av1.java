import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Av1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Av1 extends buenos
{
    static private GreenfootSound explosion = new GreenfootSound("explosion.mp3");
    static public int y1;
    static public int x1;
    static public int vidasj1;
    public void act()
    {
        y1=getY();
        x1=getX();
        
        super.arriba("w");
        
        super.izquierda("a");
        
        super.abajo("s");
        
        super.derecha("d");            
        
        super.disparar("space");
        
        if (isTouching(Malos.class))
        {
            getWorld().addObject(new Boom(), getX(), getY());
            explosion.play();
            explosion.setVolume(PANTALLA_MENÚ.volumen);
            setLocation(80, 400);
            vidasj1--;
        }        
        if(vidasj1<=0)
        {
            x1=-1;
            getWorld().removeObject(this);
        }
    }
}
