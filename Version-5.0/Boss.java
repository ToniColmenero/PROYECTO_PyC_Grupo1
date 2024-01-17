import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Malos
{
    private int direcboss=1;
    private int contaboss=0;
    public void act()
    {
        super.act();
        contaboss++;
        if(getX()<=550 || getX()>=1100 || contaboss>=200)
        {
            direcboss=direcboss*-1;
            if (contaboss>=200)
            {
                contaboss=Greenfoot.getRandomNumber(100);
            }
        }
        move((int)(4*PANTALLA_MENÚ.dificultad*direcboss));
        
        switch (atacante)
        {
            case 0:
                getWorld().addObject(new teledirigido(), getX(), getY());
                atacante=5;
                break;
            case 1:
                getWorld().addObject(new Misil(), getX(), getY());
                atacante=5;
                break;
            case 2:
                getWorld().addObject(new racimo(), getX(), getY());
                atacante=5;
                break;
        }
    }
}
