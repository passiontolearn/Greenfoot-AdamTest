import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kangaroo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangaroo extends Actor
{
    int numTurns   = 0;
    boolean jump   = true;
    boolean back   = false;

    /**
     * Act - do whatever the Kangaroo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        jumpLikeKangaroo();
        if (isAtEdge() ) {
            setLocation(10, 158);
        }
    }

    public void jumpLikeKangaroo() 
    {
        if (numTurns % 4 == 0)
        {
            if (jump) {
                setRotation(335);
                if (numTurns > 0) {
                    back = true;    // We jumped... now we must return back next time.
                }
            }
            else { 
                setRotation(45);
                back = false;   // Next time jump... don't return back.
            }
            jump = !jump;   // Toggle the jump. We'll jump once out of every two times we 'Act'.
        }
        move(15);
        numTurns++;
    }
}