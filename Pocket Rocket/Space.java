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
        super(800, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WinMessage winMessage = new WinMessage();
        addObject(winMessage,560,209);
        LooseMessage looseMessage = new LooseMessage();
        addObject(looseMessage,183,209);
        Fuel fuel = new Fuel();
        addObject(fuel,643,104);
        Fuel fuel2 = new Fuel();
        addObject(fuel2,419,142);
        Fuel fuel3 = new Fuel();
        addObject(fuel3,285,341);
        Fuel fuel4 = new Fuel();
        addObject(fuel4,196,138);
        Fuel fuel5 = new Fuel();
        addObject(fuel5,648,377);
        Fuel fuel6 = new Fuel();
        addObject(fuel6,190,377);
        Rocket rocket = new Rocket();
        addObject(rocket,408,317);
        Rocks rocks = new Rocks();
        addObject(rocks,731,200);
        Rocks rocks2 = new Rocks();
        addObject(rocks2,276,171);
        Rocks rocks3 = new Rocks();
        addObject(rocks3,108,330);

        looseMessage.setLocation(354,247);
        looseMessage.setLocation(237,165);
        winMessage.setLocation(448,350);
    }
}
