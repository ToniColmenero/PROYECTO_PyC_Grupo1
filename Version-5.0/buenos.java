import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buenos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buenos extends Actor
{
    public int cooldown;
    private int contador;
    static public GreenfootSound explosion = new GreenfootSound("explosion.mp3");
    private int i;
    public buenos(){
        contador=0;
        cooldown=(int)(50*PANTALLA_MENÚ.dificultad);
    }
    public void arriba(String teclaar)
    {
        if (Greenfoot.isKeyDown(teclaar) || getY()>=710){
            setLocation(getX(),getY()-4);
        }
    }
    public void abajo(String teclaab)
    {
        if (Greenfoot.isKeyDown(teclaab) || getY()<=0){
            setLocation(getX(),getY()+4);
        }
    }
    public void izquierda(String teclaiz)
    {
        if (Greenfoot.isKeyDown(teclaiz) || getX()>=1200){
            setLocation(getX()-4,getY());
        }
    }
    public void derecha(String teclade)
    {
        if (Greenfoot.isKeyDown(teclade) || getX()<=0){
            setLocation(getX()+4,getY());
        }
    }
    public void disparar(String tecladisp)
    {
        contador++;
        if (Greenfoot.isKeyDown(tecladisp) && contador >= cooldown)
        {
            getWorld().addObject(new Bala(), getX(), getY());
            contador=0;
        }
    } 
    /*public void colision()
    {
        if (isTouching(Malos.class))
        {
            //this.vidas--;
            //PANTALLA_BOSS.vidas--;
            getWorld().addObject(new Boom(), getX(), getY());
            explosion.play();
            explosion.setVolume(PANTALLA_MENÚ.volumen);
            setLocation(80, 400);
            
        }
    }*/
    /*public void act()
    {
        
    }*/
}
