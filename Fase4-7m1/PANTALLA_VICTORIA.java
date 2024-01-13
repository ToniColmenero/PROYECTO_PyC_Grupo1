import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PANTALLA_GAMEOVER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PANTALLA_VICTORIA extends World
{
    public static int puntos=0;
    GreenfootSound Victoria= new GreenfootSound("victoria.mp3");
    /**
     * Constructor for objects of class PANTALLA_GAMEOVER.
     * 
     */
    public PANTALLA_VICTORIA()
    {    
        super(1040, 710, 1); 
        
        setBackground("Has ganado.jpeg");
        
        showText("Puntos: "+ PANTALLA_JUEGO.puntos, 700, 560);
        
        Victoria.playLoop();
        Victoria.setVolume(PANTALLA_MENÚ.volumen);
    }
}
