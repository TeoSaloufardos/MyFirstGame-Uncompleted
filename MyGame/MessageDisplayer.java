import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MessageDiplayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessageDisplayer extends Actor
{
    /**
     * Act - do whatever the MessageDiplayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage backGround = new GreenfootImage("backGround.png");
    
    public MessageDisplayer(){
        setImage(backGround);
        backGround.clear();
    }
    
    public void setMessageToDisplay(String message){
        
        backGround.clear();
        backGround = new GreenfootImage("backGround.png");
        String text = "\n\n";
        int length = message.length();
        
        if(length <= 40){
            text = message;
        }else if(length > 40 && length <= 80){
            text = message.substring(0,40) + "\n\n" + message.substring(40);
        }else if(length > 80 && length <= 120){
            text = message.substring(0,40) + "\n\n" + message.substring(40,80) + "\n\n" + message.substring(80);
        }else if(length > 120){
            text = message.substring(0,40) + "\n\n" + message.substring(40,80) + "\n\n" + message.substring(80,120) + "\n\n" + message.substring(120);
 
        }
        GreenfootImage image =  new GreenfootImage(length*30, 300);
        
        
        Font font = new Font(true, false, 12);
        image.setFont(font);
        image.setColor(Color.RED);
        image.drawString(text,50,145);
        
        backGround.drawImage(image,1,1);
        setImage(backGround);
        
    }
    
    public void clearDisplayedMessage(){
        backGround.clear();
    }
}
