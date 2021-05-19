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
        addObject(new WallSmall (), 215, 257 );
        addObject(new WallSmall (), 498, 257);
        addObject(new WallSmall (), 216, 485);
        addObject(new WallSmall (), 498, 493);
        addObject(new WallSmall (), 645, 691);
        addObject(new WallSmall (), 533, 691);
        addObject(new WallSmall (), 421, 691);
        addObject(new WallSmall (), 311, 691);
        addObject(new WallSmall (), 199, 691);
        addObject(new WallSmall (), 88, 691);
        addObject(new WallSmall (), 68, 3);
        addObject(new WallSmall (), 177, 3);
        addObject(new WallSmall (), 288, 3);
        addObject(new WallSmall (), 400, 3);
        addObject(new WallSmall (), 508, 3);
        addObject(new WallSmall (), 599, 3);
        addObject(new WallSmall (), 665, 3);
        addObject(new WallSmall (), 441, 257);
        addObject(new WallSmall (), 270, 257);
        addObject(new WallSmall (), 353, 564);
        addObject(new WallSmall (), 129, 331);
        addObject(new WallSmall (), 584, 343);
        addObject(new WallSmall (), 676, 254);
        addObject(new WallSmall (), 12, 255);
        addObject(new WallSmall (), 545, 561);
        addObject(new WallSmall (), 174, 562);
        
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
        addObject(new WallTall (), 12, 623);
        addObject(new WallTall (), 12, 468);
        addObject(new WallTall (), 12, 314);
        addObject(new WallTall (), 12, 160);
        addObject(new WallTall (), 12, 11);
        addObject(new WallTall (), 453, 18);
        addObject(new WallTall (), 240, 18);
        
        addObject(new Basketball (), 411, 451);
        addObject(new Helmet (), 408, 340);
        addObject(new Helmet (), 357, 360);
        addObject(new Helmet (), 297, 340);
    }
        }

