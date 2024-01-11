import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Misil extends Actor
{
    PANTALLA_JUEGO juego2;
    public void act()
    {
        move(-7);
        
        Actor Av1 = getOneIntersectingObject(Av1.class);
        
        if (Av1 !=null)
        {
            juego2.vidas--;
        }
        
        if (isTouching(Av1.class) || isAtEdge()){
            if (isTouching(Av1.class))
            {
                getWorld().addObject(new Boom(), getX(), getY());
                Greenfoot.playSound("explosion.mp3");
            }
            getWorld().removeObject(this);
        }
        
    }
}
