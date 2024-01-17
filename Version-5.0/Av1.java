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
    PANTALLA_JUEGO juego3;
    static public int vidas;
    static public int y;
    static public int x;
    private int i;
    public void act()
    {
        y=getY();
        x=getX();
        
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
            vidas--;
        }        
        if(vidas/*j1*/<=0)
        {
            x=-1;
            getWorld().removeObject(this);
        }
    }
}
