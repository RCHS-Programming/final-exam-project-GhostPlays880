import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Helmet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helmet extends Actor
{
    int safeX=408;
    int safeY=340;
    /**
     * Act - do whatever the Helmet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lookForBasketball();
        randomturn();
        move(5);
    }    
    public void lookForBasketball()
    {
        if(isTouching(Basketball.class))
        
            {
                removeTouching(Basketball.class);
            }
        }
    public void randomturn()
    {
        if( Greenfoot.getRandomNumber (700) <400)
        {
            turn( Greenfoot.getRandomNumber(691)-75);
        }
    }
      public void collision()
    {
        if(isTouching(WallTall.class)|| (isTouching(WallSmall.class)))
        {
           setLocation(safeX, safeY);
        }       
        else
        {
            safeX=getX();
            safeY= getY();
        }
    }
}
