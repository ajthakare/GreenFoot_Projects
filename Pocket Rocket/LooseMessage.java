import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LooseMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LooseMessage extends Actor
{
    /**
     * Act - do whatever the LooseMessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image1= new GreenfootImage("YOU LOOSE!!!",80,Color.RED,Color.BLACK);
        
        Rocket r = (Rocket) (getWorld().getObjects(Rocket.class).get(0));
        if(r.fuels!=0 && r.rocks==1)
        {
           setImage(image1); 
        }
    }    
}
