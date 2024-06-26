import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paracaidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paracaidas extends Actor
{
    /**
     * Act - do whatever the Paracaidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static final int MOVE_AMOUNT = 5; 

    public void act() 
    {
        movimiento();
        
        extremos();
    }
    
    public void movimiento()
    {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - MOVE_AMOUNT); 
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + MOVE_AMOUNT); 
        }
    }
    
    public void extremos()
    {
        if (getY() <= 0) {
            setLocation(getX(), 0); 
        }
        if (getY() >= getWorld().getHeight() - 1) {
            setLocation(getX(), getWorld().getHeight() - 1);
        }
    }
}
