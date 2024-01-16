import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PANTALLA_BOSS extends World
{
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
        Av1.vidas/*j1*/ = (int)(5*(1/PANTALLA_MENÚ.dificultad));
        vidasboss = (int)(7*PANTALLA_MENÚ.dificultad);
        addObject(new Av1(), 80, 400);
        addObject(new Boss(), 1050, 350);
        switch (PANTALLA_MENÚ.jugadores)
        {
            case 2:
                Avj2.vidas = (int)(5*(1/PANTALLA_MENÚ.dificultad));
                addObject(new Avj2(), 80, 500);
                break;
            case 3:
                Avj2.vidas = (int)(5*(1/PANTALLA_MENÚ.dificultad));
                addObject(new Avj2(), 80, 500);
                Avj3.vidas = (int)(5*(1/PANTALLA_MENÚ.dificultad));
                addObject(new Avj3(), 80, 300);
                break;
        }
    }
    public void act(){
        showText("Puntos: " + PANTALLA_JUEGO.puntos, 60 , 30);
        
        showText("Vidas J1: " + Av1.vidas, 60, 60);
        switch (PANTALLA_MENÚ.jugadores)
        {
            case 2:
                showText("Vidas J2: " + Avj2.vidas, 180, 60);
                break;
            case 3:
                showText("Vidas J2: " + Avj2.vidas, 180, 60);
                showText("Vidas J3: " + Avj3.vidas, 300, 60);
                break;
        }
        
        showText("Vidas Boss: " + vidasboss, 70,90);
        
        if (Av1.vidas<=0 && Avj2.vidas<=0 && Avj3.vidas<=0)
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
