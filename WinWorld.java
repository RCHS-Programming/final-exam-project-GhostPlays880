import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinWorld extends World
{

    /**
     * Constructor for objects of class WinWorld.
     * 
     */
    public WinWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        showText("Great Job, player.",350,300);
        showText("If you played like that everytime,", 350,370); 
        showText("you might have a girlfriend.", 350, 400);
        showText("Press to continue Space", 350, 450);
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new PacWorld());
        }
    }
}
