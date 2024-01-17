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
    PANTALLA_JUEGO juego3;
    static public int vidas;
    static public int y;
    static public int x;
    private int i;
    public void act()
    {
        y=getY();
        x=getX();
        
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
            vidas--;
        }
        if(vidas<=0)
        {
            x=-1;
            getWorld().removeObject(this);
        }
    }
}
