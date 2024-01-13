import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PANTALLA_BOSS extends World
{
    public static int puntos;
    public static int vidas=5;
    private int timer = 2700;
    public static GreenfootSound boss = new GreenfootSound("boss.mp3");
    public PANTALLA_BOSS()
    {    
        super(1200, 710, 1); 
        setBackground("FONDOJUEGO.jpg");
        
        boss.playLoop();
        boss.setVolume(PANTALLA_MENÚ.volumen);
        
        started();
    }
    public void started (){
        puntos = 0+PANTALLA_JUEGO.puntos;
        vidas = 5;
        addObject(new Av1(), 80, 400);
        addObject(new Boss(), 1050, 350); 
    }
    public void act(){
        showText("Puntos: " + puntos, 60 , 30);
        
        showText("Vidas: " + vidas, 60, 60);
        
        showText("Tiempo: " + timer, 60,90);
        
        timer--;
        
        if (vidas<=0)
        {
            boss.stop();
            Greenfoot.setWorld(new PANTALLA_GAMEOVER());
        }
        if (timer <= 0) 
        {
            boss.stop();
            Greenfoot.setWorld(new PANTALLA_VICTORIA());
        }
    }
}
