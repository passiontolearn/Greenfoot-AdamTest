import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmilyTongue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmilyTongue extends Actor
{
    boolean turnRight = true;

    /**
     * Act - do whatever the SmilyTongue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // rotateR();
        // rotateL();
        // noNo();
    }

    public void rotateR() 
    {
        if (turnRight) {
            turn(50);
        }
        else {            
            turn(-25);        
        }                    
        turnRight = !turnRight;
    }

    public void rotateL() 
    {
        if (turnRight) {
            turn(25);
        }
        else {            
            turn(-50);        
        }                    
        turnRight = !turnRight;
    }

    public void noNo() {
        setRotation(0);
        if (turnRight) {
            turn(25);
        }
        else {
            turn(-25);        
        }                    
        turnRight = !turnRight;        
    }
}
