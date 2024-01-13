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
    public Malos() 
    {
    }
    
    public void act()
    {
        if(isAtEdge())
        {
            direc=direc*-1;
            velocidad = (int)((3+Greenfoot.getRandomNumber(7))*PANTALLA_MENÚ.dificultad);
        }

        if (direc==-1){
            setLocation(getX(),getY() +velocidad);
        }
        
        if (direc==1){
            setLocation(getX(),getY() -velocidad);
        }
        
        retraso++;
        
        if (retraso>=(int)(100*(0.8/PANTALLA_MENÚ.dificultad)))
        {
            retraso=0;
            atacante=Greenfoot.getRandomNumber(3);
        }
        
    }
    
}
