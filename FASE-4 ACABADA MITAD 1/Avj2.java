import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avj2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avj2 extends buenos
{
    static private GreenfootSound explosion = new GreenfootSound("explosion.mp3");
    static public int y2;
    static public int x2;
    static public int vidasj2=0;
    public void act()
    {
        y2=getY();
        x2=getX();
        
        super.arriba("up");
        
        super.izquierda("left");
        
        super.abajo("down");
        
        super.derecha("right");
        
        super.disparar("enter");
        
        if (isTouching(Malos.class))
        {
            getWorld().addObject(new Boom(), getX(), getY());
            explosion.play();
            explosion.setVolume(PANTALLA_MENÚ.volumen);
            setLocation(80, 400);
            vidasj2--;
        }
        if(vidasj2<=0)
        {
            x2=-1;
            getWorld().removeObject(this);
        }
    }
}
