import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseWorld extends World
{

    /**
     * Constructor for objects of class LoseWorld.
     * 
     */
    public LoseWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        showText("Hey kid. Big H here.",350,300);
        showText("Don't worry you weren't too bad, you sucked.", 350,370); 
        showText("Now, go home and cry to your mommy", 350, 400);
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
