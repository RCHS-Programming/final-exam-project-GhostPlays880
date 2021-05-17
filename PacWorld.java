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
        
        addObject(new WallSmall (), 408, 407 );
        addObject(new WallSmall (), 297, 408 );
        addObject(new WallSmall (), 215, 259 );
        addObject(new WallSmall (), 498, 257);
        addObject(new WallSmall (), 216, 485);
        addObject(new WallSmall (), 498, 493);
        addObject(new WallTall (), 450, 340 );
        addObject(new WallTall (), 250, 340 );
        addObject(new WallTall (), 540, 411 );
        addObject(new WallTall (), 174, 404 );
        addObject(new WallTall (), 357, 492 );
        addObject(new WallTall (), 693, 15);
        addObject(new WallTall (), 693, 170);
        addObject(new WallTall (), 693, 320);
        addObject(new WallTall (), 693, 460);
        addObject(new WallTall (), 693, 610);
    }
        }

