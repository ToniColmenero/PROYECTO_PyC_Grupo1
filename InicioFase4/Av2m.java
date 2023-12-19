import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Av2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Av2m extends Actor
{
    public Av2m(){

    
    }
    int t=1;
    /**
     * Act - do whatever the Av2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    if(isAtEdge()){t=t*-1;}
        if (t==1){
        setLocation(getX(),getY()-6);
    }
        if (t==-1){
        setLocation(getX(),getY()+4);
    }
}
}