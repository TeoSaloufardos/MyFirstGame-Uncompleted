import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hearts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hearts extends Actor
{
    /**
     * Act - do whatever the Hearts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage backGround = new GreenfootImage("backGround.png");
    private int currentHearts;
    private GreenfootSound hurtSound = new GreenfootSound("hurt.mp3");
    public Hearts(){
        currentHearts = 3;
    }

    public void hurt(){
        currentHearts--;
        makeHearts();
        hurtSound.play();
    }
    
    public void generateHeartsImage(int imageIndicator){
            GreenfootImage image = new GreenfootImage("hearts" + imageIndicator + ".png");
            image.drawImage(image,100,100);
            setImage(image);
    }
    
    
    public void makeHearts()
    {
        if(currentHearts == 3){
            generateHeartsImage(currentHearts);
        }else if(currentHearts == 2){
            generateHeartsImage(currentHearts); 
        }else if(currentHearts == 1){
            generateHeartsImage(currentHearts);
        }
    }
    
    public int getLife(){
        return currentHearts;
    }
    
    
}
