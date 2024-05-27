import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gaviota2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gaviota2 extends Actor
{
    /**
     * Act - do whatever the meteorito2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed = 2; 
    private int delay = 50; 
    private int actCount = 0; 
    
    public void act() 
    {
        if (actCount < delay) 
        {
            actCount++;
            return; 
        }
        movimiento();

        eliminar(); 
    }
    
    public void movimiento()
    {
        setLocation(getX() - speed, getY());

        setLocation(getX() - 1, getY());

        if (getX() <= 0)
        {
            int newY = Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(getWorld().getWidth() - 1, newY);
        }
    }
    
    public void eliminar()
    {
        Actor paracaidas;
        paracaidas = getOneObjectAtOffset(0, 0, Paracaidas.class);
        if (paracaidas != null)
        {
            World world;
            world = getWorld();
            Greenfoot.playSound("explosion.mp3");
            world.removeObject(paracaidas);
            Greenfoot.setWorld(new Inicio());
        }
    }
    
}

