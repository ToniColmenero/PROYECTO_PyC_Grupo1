import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PANTALLA_BOSS extends World
{
    //public static int puntos;
    public static int vidasboss;
    //public static GreenfootSound boss = new GreenfootSound("boss2.mp3");
    public PANTALLA_BOSS()
    {    
        super(1200, 710, 1); 
        setBackground("FONDOCIELO.png");
        
        //PANTALLA_JUEGO.Juego.play();
        //PANTALLA_JUEGO.Juego.setVolume(PANTALLA_MENÚ.volumen);
        //boss.setVolume(PANTALLA_MENÚ.volumen);
        
        started();
    }
    public void started (){
        Av1.vidasj1 = (int)(5*(1/PANTALLA_MENÚ.dificultad));
        vidasboss = (int)(7*PANTALLA_MENÚ.dificultad);
        addObject(new Av1(), 80, 400);
        addObject(new Boss(), 1050, 350);
        if (Menu.j2==true)
        {
            Avj2.vidasj2 = (int)(5*(1/PANTALLA_MENÚ.dificultad));
            addObject(new Avj2(), 80, 500);
        }
    }
    public void act(){
        //showText("Puntos: " + puntos, 60 , 30);
        
        showText("Vidas J1: " + Av1.vidasj1, 60, 60);
        if(Menu.j2==true)
        {
            showText("Vidas J2: " + Avj2.vidasj2, 180, 60);
        }
        
        showText("Vidas Boss: " + vidasboss, 60,90);
        
        if (Av1.vidasj1<=0 && Avj2.vidasj2<=0)
        {
            //boss.stop();
            //PANTALLA_JUEGO.Juego.stop();
            Greenfoot.setWorld(new PANTALLA_GAMEOVER());
        }
        if (vidasboss <= 0) 
        {
            //boss.stop();
            //PANTALLA_JUEGO.Juego.stop();
            Greenfoot.setWorld(new PANTALLA_VICTORIA());
        }
    }
}
