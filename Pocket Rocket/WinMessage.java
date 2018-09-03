import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinMessage extends Actor
{
    /**
     * Act - do whatever the WinMessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image= new GreenfootImage("YOU WIN!!!",80,Color.YELLOW,Color.BLACK);
        
        Rocket r = (Rocket) (getWorld().getObjects(Rocket.class).get(0));
        if(r.fuels==0)
        {
           setImage(image); 
        }
        
    }    
}
