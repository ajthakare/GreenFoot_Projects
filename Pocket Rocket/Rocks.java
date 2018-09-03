import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocks extends Actor
{
    /**
     * Act - do whatever the Rocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(Greenfoot.getRandomNumber(7));
        turn(10-Greenfoot.getRandomNumber(20));
        
        if(getX()<=5 || getX()>=getWorld().getWidth()-5)
        {
            turn(180);
        }
        if(getY()<=5 || getY()>=getWorld().getHeight()-5)
        {
            turn(180);
        }
    }    
}
