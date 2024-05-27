import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends World
{

    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public Nivel3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,116,274);
        Asteroide asteroide = new Asteroide();
        addObject(asteroide,575,50);
        Asteroide asteroide2 = new Asteroide();
        addObject(asteroide2,575,171);
        Asteroide asteroide3 = new Asteroide();
        addObject(asteroide3,578,295);
        Asteroide asteroide4 = new Asteroide();
        addObject(asteroide4,576,369);
    }
}
