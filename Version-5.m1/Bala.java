import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    PANTALLA_JUEGO juego;
    PANTALLA_BOSS pboss;
    static private GreenfootSound explosion = new GreenfootSound("explosion.mp3");
    public void act()
    {
        move(9);
        
        Actor Malos = getOneIntersectingObject(Malos.class);
        Actor Elboss = getOneIntersectingObject(Boss.class);
        if (Malos !=null || isAtEdge())
        {
            if (Malos !=null)
            {
                getWorld().addObject(new Boom(), getX(), getY());
                explosion.play();
                explosion.setVolume(PANTALLA_MENÚ.volumen);
                juego.puntos++;
            }
            if (Elboss !=null)
            {
                PANTALLA_BOSS.vidasboss--;
            }
            getWorld().removeObject(this);
        }
    }
}
