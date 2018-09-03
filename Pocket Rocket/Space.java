import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WinMessage winMessage = new WinMessage();
        addObject(winMessage,385,280);
        LooseMessage looseMessage = new LooseMessage();
        addObject(looseMessage,385,430);
        Rocket rocket = new Rocket();
        addObject(rocket,386,517);
        rocket.turn(270);
        Fuel fuel = new Fuel();
        addObject(fuel,702,230);
        Fuel fuel2 = new Fuel();
        addObject(fuel2,395,130);
        Fuel fuel3 = new Fuel();
        addObject(fuel3,82,320);
        Fuel fuel4 = new Fuel();
        addObject(fuel4,223,78);
        Fuel fuel5 = new Fuel();
        addObject(fuel5,559,506);
        Fuel fuel6 = new Fuel();
        addObject(fuel6,147,531);

        Rocks rocks = new Rocks();
        addObject(rocks,750,656);
        Rocks rocks2 = new Rocks();
        addObject(rocks2,75,97);
        Rocks rocks3 = new Rocks();
        addObject(rocks3,646,63);
    }
}
