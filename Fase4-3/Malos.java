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
    public void act()
    {
        if(isAtEdge()){direc=direc*-1;}
        if (direc==-1){
            setLocation(getX(),getY()+6);
        }
        if (direc==1){
            setLocation(getX(),getY()-4);
        }
    }
}
