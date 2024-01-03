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
    public Av1(){
    
        ultdisparo=0;
        contador=0;
        cooldown=40;
        
    }

    /**
     * Act - do whatever the Av1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    PANTALLA_JUEGO juego3;
    public void act()
    {
        // El personaje se mueve dos celdas en la direccion asignada. Cuando llegue a un borde, girara 180 grados.
        contador++;
        
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
            
            int xbAv1=getX();
            int ybAv1=getY();
            
            getWorld().addObject(new Bala(), xbAv1, ybAv1);
            ultdisparo=contador;
        } 
        if (isTouching(Malos.class))
        {
            juego3.vidas--;
            setLocation(80, 400);
        }
        
        
    }
    
}

