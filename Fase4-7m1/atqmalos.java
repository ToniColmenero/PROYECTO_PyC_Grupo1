import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class atqmalos extends Actor
{
    PANTALLA_JUEGO juego2;
    static public GreenfootSound explo = new GreenfootSound("explosion.mp3");
    public void act()
    {
        move((int)(-7*PANTALLA_MENÚ.dificultad));
        
        Actor Av1 = getOneIntersectingObject(Av1.class);
        
        if (Av1 !=null)
        {
            juego2.vidas--;
            PANTALLA_BOSS.vidas--;
        }
        
        if (isTouching(Av1.class) || isAtEdge()){
            if (isTouching(Av1.class))
            {
                getWorld().addObject(new Boom(), getX(), getY());
                explo.play();
                explo.setVolume(PANTALLA_MENÚ.volumen);
            }
            getWorld().removeObject(this);
        }
    }
}
