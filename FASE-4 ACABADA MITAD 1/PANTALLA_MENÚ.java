import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PANTALLA_MENÚ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PANTALLA_MENÚ extends World
{
    //static public GreenfootSound Inicio= new GreenfootSound("inicio2.mp3");
    
    static public float dificultad=1;
    
    static public int volumen=100;

    public PANTALLA_MENÚ()
    {    
        super(1200, 710, 1); 
        
        setBackground("Menu.jpeg");
        
        PANTALLA_JUEGO.puntos=0;
        
        dificultad=1;
        
        addObject(new Boton(), 630, 410);
        
        addObject(new facil(), 550, 530);
        
        addObject(new medio(), 630, 530);
        
        addObject(new dificil(), 710, 530);
        
        addObject(new desafio(), 630, 620);
        
        addObject(new volmas(), 80, 630);
        
        addObject(new volmen(), 80, 680);
        
        addObject(new solo(), 50, 450);
        
        addObject(new duo(), 120, 450);
    }
    public void act()
    {
        showText("Volumen: "+volumen, 80, 590);
        //Inicio.setVolume(volumen);
    }
}
