import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Inicio extends World
{
    public Inicio()
    {    
        super(600, 400, 1); 
        addObject(new Menu(), getWidth() / 2, getHeight() / 2);
    }
}

