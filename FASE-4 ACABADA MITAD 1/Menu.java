import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menú here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    public static boolean j2;
    /**
     * Act - do whatever the desafio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public void SetJugadores(boolean jugs){
        if (Greenfoot.mouseClicked(this))
        {
            j2 = jugs;
        }
    }
    public void SetDificultad(float dif){
        if (Greenfoot.mouseClicked(this))
            {
                PANTALLA_MENÚ.dificultad = dif;
            }
    }
    public void SetVol(int vol){
        if (Greenfoot.mouseClicked(this) && PANTALLA_MENÚ.volumen+vol>=0 && PANTALLA_MENÚ.volumen+vol<=100)
            {
                PANTALLA_MENÚ.volumen = PANTALLA_MENÚ.volumen+vol;
            }
        }
}
