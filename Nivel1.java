import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends World
{

    /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
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
        Paracaidas paracaidas = new Paracaidas();
        addObject(paracaidas,88,183);
        Gaviota gaviota = new Gaviota();
        addObject(gaviota,572,101);
        Gaviota2 gaviota2 = new Gaviota2();
        addObject(gaviota2,570,205);
        Gaviota gaviota3 = new Gaviota();
        addObject(gaviota3,583,319);
    }
}
