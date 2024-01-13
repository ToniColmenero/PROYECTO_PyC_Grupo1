import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Av1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Av1 extends Actor
{
    private int cooldown;
    private int ultdisparo;
    private int contador;
    static private GreenfootSound explosion = new GreenfootSound("explosion.mp3");
    static public int y;
    static public int x;
    public Av1(){
    
        ultdisparo=0;
        contador=0;
        cooldown=(int)(50*PANTALLA_MENÚ.dificultad);
        
    }

    PANTALLA_JUEGO juego3;
    public void act()
    {
        contador++;
        y=getY();
        x=getX();
        if (Greenfoot.isKeyDown("w") || getY()>=1200){
            setLocation(getX(),getY()-4);
        }
        
        if (Greenfoot.isKeyDown("a") || getX()>=1200){
            setLocation(getX()-4,getY());
        }
        
        if (Greenfoot.isKeyDown("s") || getY()<=0){
            setLocation(getX(),getY()+4);
        }
        
        if (Greenfoot.isKeyDown("d") || getX()<=0){
            setLocation(getX()+4,getY());    
        }            
        
        if (Greenfoot.isKeyDown("space") && contador - ultdisparo > cooldown)
        {
            getWorld().addObject(new Bala(), getX(), getY());
            ultdisparo=contador;
        } 
        
        if (isTouching(Malos.class))
        {
            juego3.vidas--;
            PANTALLA_BOSS.vidas--;
            getWorld().addObject(new Boom(), getX(), getY());
            explosion.play();
            explosion.setVolume(PANTALLA_MENÚ.volumen);
            setLocation(80, 400);
            
        }
    }
}

