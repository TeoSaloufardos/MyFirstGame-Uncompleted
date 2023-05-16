import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Characters
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final int MOVE_SPEED = 8;
    private int moveTimer = 0;
    
    public void act() {
        if (moveTimer <= 0) {
            randomMove();
            moveTimer = Greenfoot.getRandomNumber(20);
        } else {
            moveTimer--;
        }
    }
    
    private void stopMove(){
        setLocation(0,0);
    }
    private void randomMove() {
    int direction = Greenfoot.getRandomNumber(4);
    int newX = getX();
    int newY = getY();

    if (direction == 0) {
        newX += MOVE_SPEED;
        changeImageAndPlaySound("monsterRight.png", "monsterRight2.png");
    } else if (direction == 1) {
        newX -= MOVE_SPEED;
        changeImageAndPlaySound("monsterLeft.png", "monsterLeft2.png");
    } else if (direction == 2) {
        newY += MOVE_SPEED;
        changeImageAndPlaySound("monsterForward.png", "monsterForward2.png");
    } else {
        newY -= MOVE_SPEED;
        changeImageAndPlaySound("monsterBackward.png", "monsterBackward2.png");
    }
    
    if (newX < 0 || newX >= getWorld().getWidth() || newY < 0 || newY >= getWorld().getHeight()) {
        turn(180);
    } else {
        setLocation(newX, newY);
    }
    
}
}




