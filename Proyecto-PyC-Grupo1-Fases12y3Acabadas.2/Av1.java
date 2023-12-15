import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Av1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Av1 extends Actor
{
    
    public Av1(){
    
        
    }
    
    /**
     * Act - do whatever the Av1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // El personaje se mueve dos celdas en la direccion asignada. Cuando llegue a un borde, girara 180 grados.
        
        
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

        //if (Greenfoot.isKeyDown("space")){
        //int xbAv1=getX();
        //int ybAv1=getY();
        //addObject(new Bala(), xbAv1, ybAv1);
        } 
    }

