import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class atqmalos extends Actor
{
    PANTALLA_JUEGO juego2;
    static public GreenfootSound explo = new GreenfootSound("explosion.mp3");
    /*Actor Avi2 = getOneIntersectingObject(Avj2.class);
    Actor Avi1 = getOneIntersectingObject(Av1.class);
    Actor Avi3 = getOneIntersectingObject(Avj3.class);*/
    public void act()
    {
        move((int)(-7*PANTALLA_MENÚ.dificultad));
        if (getOneIntersectingObject(Av1.class) !=null)
        {
            Av1.vidas--;
            getWorld().addObject(new Boom(), getX(), getY());
            explo.play();
            explo.setVolume(PANTALLA_MENÚ.volumen);
        }
        
        if(PANTALLA_MENÚ.jugadores==2 || PANTALLA_MENÚ.jugadores==3)
        {
            //Actor Avi2 = getOneIntersectingObject(Avj2.class);
            if (getOneIntersectingObject(Avj2.class) !=null)
            {
                Avj2.vidas--;
                getWorld().addObject(new Boom(), getX(), getY());
                explo.play();
                explo.setVolume(PANTALLA_MENÚ.volumen);
            }
            if (getOneIntersectingObject(Avj3.class) !=null)
            {
                Avj3.vidas--;
                getWorld().addObject(new Boom(), getX(), getY());
                explo.play();
                explo.setVolume(PANTALLA_MENÚ.volumen);
            }
        }
        
        if (getOneIntersectingObject(buenos.class) !=null || isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
