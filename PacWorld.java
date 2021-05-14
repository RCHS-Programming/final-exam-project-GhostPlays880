import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PacWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacWorld extends World
{

    /**
     * Constructor for objects of class PacWorld.
     * 
     */
    public PacWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1);
        
        addObject(new WallFinal (), 350, 400 );
        addObject(new WallFinal (), 215, 259 );
        addObject(new WallFinal (), 498, 257);
        addObject(new Wall2 (), 450, 340 );
        addObject(new Wall2 (), 250, 340 );
    }
        }

