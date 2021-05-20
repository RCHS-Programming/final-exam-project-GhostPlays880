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
        move(2);
    }    
    public void lookForBasketball()
    {
        if(isTouching(Basketball.class))
        
            {
                Greenfoot.setWorld(new LoseWorld());
            }
        }
    public void randomturn()
    {
        //if( Greenfoot.getRandomNumber (700) <400)
        //{
        //    turn( Greenfoot.getRandomNumber(691)-75);
        //}
        int x= getWorld().getObjects(Basketball.class).get(0).getX();
        int y= getWorld().getObjects(Basketball.class).get(0).getY();
        turnTowards(x,y);
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
