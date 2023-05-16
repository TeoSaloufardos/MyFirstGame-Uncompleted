import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author Teo 
 * @version Alpha
 */
public class Instructions extends World
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        super(900, 800, 1); 
        instructions();
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("Space"))
            Greenfoot.setWorld(new MainWorld());
    }
    public void instructions()
    {
        String text = "Welcome to The Numbers' Trial";
        text += "\n\nYou have to kill 4 Monsters in First Stage";
        text += "\n\nand 6 Monsters in the Second One";
        text += "\n\nBy touching a Monster you should select";
        text += "\n\nBetween \"M\" for subtraction or";
        text += "\n\n\"P\" for addition. Then answering/typing the correct";
        text += "\n\nnumber, the monster will be killed.";
        text += "\n\nPress SPACE to start. Good Luck!";
        text += "\n\n\nAuthor: SalouFardos13";
        GreenfootImage textImg = new GreenfootImage(text, 24, Color.RED, new Color(0, 0, 0, 0));
        getBackground().drawImage(textImg, (getWidth()-textImg.getWidth())/2, (getHeight()-textImg.getHeight())/2);
    }
}

