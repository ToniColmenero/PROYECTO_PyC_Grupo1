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
    PANTALLA_VICTORIA victoria;
    PANTALLA_GAMEOVER derrota;
    public void act()
    {
        move(9);
        
        Actor Malos = getOneIntersectingObject(Malos.class);
        
        if (Malos !=null)
        {
            juego.puntos++;
            victoria.puntos++;
            derrota.puntos++;
        }
        
        if (isTouching(Malos.class) || isAtEdge())
        {
            if (isTouching(Malos.class))
            {
                getWorld().addObject(new Boom(), getX(), getY());
                Greenfoot.playSound("explosion.mp3");
            }
            getWorld().removeObject(this);

        }
    }
}
