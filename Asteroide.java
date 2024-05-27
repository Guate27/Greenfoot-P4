import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroide extends Actor
{
    /**
     * Act - do whatever the Asteroide wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        private int speed = 2; 
    
    public void act()
    {
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
        Actor rocket;
        rocket = getOneObjectAtOffset(0, 0, Rocket.class);
        if (rocket != null)
        {
            World world;
            world = getWorld();
            Greenfoot.playSound("explosion.mp3");
            world.removeObject(rocket);
            Greenfoot.setWorld(new Inicio());
        }
    }
}
