import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Malos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Malos extends Actor
{
    int direc=1;
    int velocidad=5;
    public int retraso;
    public int atacante;
    //public boolean ataque;
    public Malos() 
    {
        //int retraso=0;
        //int atacante;
    }
    
    public void act()
    {
        if(isAtEdge())
        {
            direc=direc*-1;
            velocidad = 2+Greenfoot.getRandomNumber(8);
        }
        
        
        
        if (direc==-1){
            setLocation(getX(),getY() +velocidad);
        }
        
        if (direc==1){
            setLocation(getX(),getY() -velocidad);
        }
        
        retraso++;
        
        if (retraso>=100)
        {
            retraso=0;
            atacante=Greenfoot.getRandomNumber(3);
        }
        
    }
    
}
