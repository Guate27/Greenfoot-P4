import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends Actor
{
    public Menu() {
        GreenfootImage image = new GreenfootImage("background1.jpg"); 
        image.scale(600, 400);

        drawTitle(image, "Spaceship"); 

        drawButton(image, "1: Nivel 1", 100, new Color(255, 102, 0)); 
        drawButton(image, "2: Nivel 2", 150, new Color(255, 178, 102)); 
        drawButton(image, "3: Nivel 3", 200, new Color(255, 255, 204)); 

        setImage(image);
    }

    private void drawTitle(GreenfootImage image, String text) {
        image.setColor(Color.BLACK);
        image.setFont(new Font("Press Start 2P", true, false, 48)); 
        image.drawString(text, 60, 50);
    }

    private void drawButton(GreenfootImage image, String text, int y, Color buttonColor) {
        image.setColor(buttonColor);
        image.fillRect(50, y - 15, 300, 30);
        image.setColor(new Color(0, 102, 204)); 
        image.drawRect(50, y - 15, 300, 30);
        image.setColor(Color.BLACK);
        image.setFont(new Font("Press Start 2P", true, false, 18)); 
        image.drawString(text, 60, y + 5);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                int x = mouse.getX();
                int y = mouse.getY();

                if (x >= 50 && x <= 350) {
                    if (y >= 80 && y <= 120) {  
                        Greenfoot.setWorld(new Nivel1());
                    } else if (y >= 130 && y <= 170) {  
                        Greenfoot.setWorld(new Nivel2());
                    } else if (y >= 180 && y <= 220) {  
                        Greenfoot.setWorld(new Nivel3());
                    }
                }
            }
        }
    }
}










