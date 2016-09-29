import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with X*Y cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Sheep sheep = new Sheep();
        addObject(sheep,111,165);

        Kangaroo kangaroo = new Kangaroo();
        addObject(kangaroo,320,158);
        SmilyTongue smilytongue = new SmilyTongue();
        addObject(smilytongue,526,163);
        smilytongue.setLocation(467,156);
    }
}
