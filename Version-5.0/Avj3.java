import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Av1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avj3 extends buenos
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
        
        super.arriba("i");
        
        super.izquierda("j");
        
        super.abajo("k");
        
        super.derecha("l");            
        
        super.disparar("p");
        
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
