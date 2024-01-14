import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class atqmalos extends Actor
{
    PANTALLA_JUEGO juego2;
    static public GreenfootSound explo = new GreenfootSound("explosion.mp3");
    public void act()
    {
        move((int)(-7*PANTALLA_MENÚ.dificultad));
        
        //Actor Avi1 = getOneIntersectingObject(Av1.class);
        if (getOneIntersectingObject(Av1.class) !=null)
        {
            Av1.vidasj1--;
        }
        
        if(Menu.j2==true)
        {
            Actor Avi2 = getOneIntersectingObject(Avj2.class);
            if (Avi2 !=null)
            {
                Avj2.vidasj2--;
            }
        }
        
        if (isTouching(buenos.class) || isAtEdge()){
            if (isTouching(buenos.class))
            {
                getWorld().addObject(new Boom(), getX(), getY());
                explo.play();
                explo.setVolume(PANTALLA_MENÚ.volumen);
            }
            getWorld().removeObject(this);
        }
    }
}
