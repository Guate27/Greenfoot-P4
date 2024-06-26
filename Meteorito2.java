import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meteorito2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteorito2 extends Actor
{
    /**
     * Act - do whatever the meteorito2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed = 2; 
    private int delay = 50; // Retraso inicial en actos antes de comenzar a moverse
    private int actCount = 0; // Contador de actos
    
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
        Actor ship;
        ship = getOneObjectAtOffset(0, 0, Ship.class);
        if (ship != null)
        {
            World world;
            world = getWorld();
            Greenfoot.playSound("explosion.mp3");
            world.removeObject(ship);
            Greenfoot.setWorld(new Inicio());
        }
    }
    
}

