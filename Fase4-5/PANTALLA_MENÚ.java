import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PANTALLA_MENÚ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PANTALLA_MENÚ extends World
{
    public GreenfootSound Inicio= new GreenfootSound("inicio.mp3");
    
    static public float dificultad;

    public PANTALLA_MENÚ()
    {    
        super(1200, 710, 1); 
        
        setBackground("Menu.jpeg");
        
        Inicio.play();
        
        dificultad=1;
        
        addObject(new Boton(), 630, 410);
        
        addObject(new facil(), 550, 530);
        
        addObject(new medio(), 630, 530);
        
        addObject(new dificil(), 710, 530);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(Boton.class))
        {
            Inicio.stop();
            Greenfoot.setWorld(new PANTALLA_JUEGO()); 
            
        }
    }
    public static float GetDificultad(){
        return dificultad;
    }
    public static void SetDificultad(float dif){
        dificultad = dif;
    }
    
}
