import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Characters
{
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        timeForFight();
        checkNextLevel();
    }
    
    public static final int SPEED = 2; 
    private int currentLevel;
    private GreenfootImage currentImage;
    private MessageDisplayer messageDisplayer;
    private Hearts myHp;
    private Counter myScore;
    private World currentWorld;
    private GreenfootSound footStep = new GreenfootSound("footStep.mp3");
    
    public User(MessageDisplayer message, Hearts myLife, Counter score){
        currentLevel = 1;
        this.myHp = myLife;
        currentWorld = getWorld();
        this.myScore = score;
        this.messageDisplayer = message;
        currentImage = new GreenfootImage("playerBackward.png");
        setImage(currentImage);
    }
    
    public void move(){
            if(Greenfoot.isKeyDown("up")){
                    changeImageAndPlaySound("playerForward.png", "playerForward2.png");
                    setLocation(getX() + 0, getY() - SPEED);
                    footStep.play();
                    if(isTouching(Obstacle.class)){
                        setLocation(getX() + 0, getY() + SPEED);
                    }
            }else if(Greenfoot.isKeyDown("down")){
                    changeImageAndPlaySound("playerBackward.png", "playerBackward2.png");
                    setLocation(getX() + 0, getY() + SPEED);
                    footStep.play();
                    if(isTouching(Obstacle.class)){
                        setLocation(getX() + 0, getY() - SPEED);
                    }
            }else if(Greenfoot.isKeyDown("right")){  
                    changeImageAndPlaySound("playerRight.png", "playerRight2.png");
                    setLocation(getX() + SPEED, getY() + 0);
                    footStep.play();
                    if(isTouching(Obstacle.class)){
                        setLocation(getX() - SPEED, getY() + 0);
                    }
            }else if(Greenfoot.isKeyDown("left")){
                    changeImageAndPlaySound("playerLeft.png", "playerLeft2.png");
                    setLocation(getX() - SPEED, getY() + 0);
                    footStep.play();
                    if(isTouching(Obstacle.class)){
                        setLocation(getX() + SPEED, getY() + 0);
                    }
                }else{
                    footStep.stop();
                }
            }      
            
    public void timeForFight(){
        if(isTouching(Monster.class)){
            messageDisplayer.setMessageToDisplay("Press [P] for addition math or [M] for a subtraction math.");
            if(Greenfoot.isKeyDown("P")){
                messageDisplayer.clearDisplayedMessage();
                int firstNumber = Greenfoot.getRandomNumber(5);
                int secondNumber = Greenfoot.getRandomNumber(4);
                int answerIs = firstNumber + secondNumber;
                String answerToString = Integer.toString(answerIs);
                messageDisplayer.setMessageToDisplay("Type the answer of the following math: " + "\n" + firstNumber + " + " + secondNumber + " = ?");
                    if(Greenfoot.isKeyDown(answerToString)){
                        killMonsterAndIncreaseScore();
                    }else{
                        checkLifeAndHurt();
                }
                
            }else if(Greenfoot.isKeyDown("M")){
                
                messageDisplayer.clearDisplayedMessage();
                int firstNumber = Greenfoot.getRandomNumber(5);
                int secondNumber = Greenfoot.getRandomNumber(2);
                int answerIs = firstNumber - secondNumber;
                while(answerIs < 0){
                    firstNumber = Greenfoot.getRandomNumber(9);
                    secondNumber = Greenfoot.getRandomNumber(9);
                    answerIs = firstNumber - secondNumber;
                }
                String answerToString = Integer.toString(answerIs);
                messageDisplayer.setMessageToDisplay("Type the answer of the following math: " + "\n" + firstNumber + " - " + secondNumber + " = ?");
                    if(Greenfoot.isKeyDown(answerToString)){
                        killMonsterAndIncreaseScore();
                    }else{
                        checkLifeAndHurt();     
                }
        }
    }   
    }
    public void killMonsterAndIncreaseScore(){
        messageDisplayer.clearDisplayedMessage();
        removeTouching(Monster.class);
        GreenfootSound deathSound = new GreenfootSound("death.mp3");
        deathSound.play();
        myScore.add(1);
    }

    public void checkLifeAndHurt(){
        if(myHp.getLife() > 0){
            this.setLocation(697,19);
            messageDisplayer.clearDisplayedMessage();
            myHp.hurt();
        }else{
            messageDisplayer.setMessageToDisplay("You died, press SPACE to try again");
            Greenfoot.setWorld(new Instructions());
        }
    }


    public void checkNextLevel(){
        if (currentLevel == 1 && myScore.getValue() > 4){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new SecondStage(this, myHp, myScore, messageDisplayer));
            myScore.setValue(0);
            currentLevel++;
        }else if (currentLevel == 2 && myScore.getValue() == 6){
            footStep.stop();
            victory();
        }
    }
    
    public void victory(){
        GreenfootSound victorySong = new GreenfootSound("victory.mp3");
        victorySong.play();
        messageDisplayer.setMessageToDisplay("Congratulations !! \nYour score: " + Integer.toString(myScore.getValue()));  
        Greenfoot.stop();
    }
    
}
