import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int fuels=6,rocks=0;
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
        
        Actor Fuel=getOneObjectAtOffset(0,0,Fuel.class);
        if(Fuel!=null && rocks<1)
        {
            World world =getWorld();
            world.removeObject(Fuel);
            fuels--;
        }
        
        Actor Rock=getOneObjectAtOffset(0,0,Rocks.class);
        if(Rock!=null && fuels>0 &&rocks<1)
        {
            World world =getWorld();
            world.removeObject(Rock);
            rocks++;
        }
    }    
}
