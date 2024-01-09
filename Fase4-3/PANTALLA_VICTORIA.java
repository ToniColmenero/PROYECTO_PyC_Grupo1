import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class PANTALLA_VICTORIA extends World
{
    public static int puntos = 0;
    
    public PANTALLA_VICTORIA()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1040, 710, 1); 
        
        setBackground("Has ganado.jpeg");
        
        showText("Puntos: "+ puntos, 610, 660);
    }
}
