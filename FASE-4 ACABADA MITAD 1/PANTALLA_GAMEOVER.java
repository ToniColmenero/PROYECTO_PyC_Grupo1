import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PANTALLA_GAMEOVER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PANTALLA_GAMEOVER extends World
{
    GreenfootSound Derrota= new GreenfootSound("derrota.mp3");
    /**
     * Constructor for objects of class PANTALLA_GAMEOVER.
     * 
     */
    public PANTALLA_GAMEOVER()
    {    
        super(1200, 710, 1); 
        
        setBackground("GAMEOVER.jpeg");
        
        showText("Puntos: "+ PANTALLA_JUEGO.puntos, 600, 580);
        
        Derrota.playLoop();
        Derrota.setVolume(PANTALLA_MENÚ.volumen);
    }
}
