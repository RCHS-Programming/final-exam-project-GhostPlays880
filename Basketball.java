import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Basketball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basketball extends Actor
{
    int safeX=411 ;
    int safeY=451 ;
    /**
     * Act - do whatever the Basketball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Movement();
        collision();
    }    
    public void Movement()
    {
        if(Greenfoot.isKeyDown ("up"))
        {
            setLocation( getX(), getY() -3);
        }
        if(Greenfoot.isKeyDown ("down"))
        {
            setLocation( getX(), getY() +3);
        }
        if(Greenfoot.isKeyDown ("left"))
        {
            setLocation( getX()-3, getY() );
        }
        if(Greenfoot.isKeyDown ("right"))
        {
            setLocation( getX()+3, getY() );
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
 