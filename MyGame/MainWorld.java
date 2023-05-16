import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Set;

/**
 * Write a description of class MainWorld here.
 * 
 * @author Teo 
 * @version Alpha
 */
public class MainWorld extends World
{ 
    public MainWorld()
    {    
        super(850, 600, 1); 
        prepare();
        
        Hearts playerLife = new Hearts();
        playerLife.makeHearts();
        
        addObject(playerLife, 90,30);
        
        Counter score = new Counter();
        addObject(score,425,30);
        
        MessageDisplayer message = new MessageDisplayer();
        addObject(message, 425,200);
        
        User user = new User(message, playerLife, score);
        addObject(user,697,19);
        
    }
    
    private GreenfootSound backgroundSound = new GreenfootSound("backGround.mp3");
    
    private void prepare()
    {
        
        backgroundSound.setVolume(30);
        backgroundSound.playLoop();

        BuildingObstacle2 buildingObstacle2 = new BuildingObstacle2();
        addObject(buildingObstacle2,692,249);
        BuildingObstacle1 buildingObstacle1 = new BuildingObstacle1();
        addObject(buildingObstacle1,770,430);
        CastleObstacle castleObstacle = new CastleObstacle();
        addObject(castleObstacle,413,347);
        CrystalObstacle crystalObstacle = new CrystalObstacle();
        addObject(crystalObstacle,569,178);
        CrystalObstacle crystalObstacle2 = new CrystalObstacle();
        addObject(crystalObstacle2,188,477);
        TowerObstacle towerObstacle = new TowerObstacle();
        addObject(towerObstacle,150,225);
        towerObstacle.setLocation(164,213);
        towerObstacle.setLocation(150,231);
        towerObstacle.setLocation(162,231);
        towerObstacle.setLocation(157,248);
        towerObstacle.setLocation(177,345);
        towerObstacle.setLocation(258,219);
        removeObject(towerObstacle);
        buildingObstacle2.setLocation(710,252);
        buildingObstacle2.setLocation(687,285);
        buildingObstacle2.setLocation(719,257);
        addObject(towerObstacle,149,225);
        buildingObstacle2.setLocation(713,259);
        removeObject(buildingObstacle2);
        addObject(buildingObstacle2,692,251);
        obstacleNail obstacleNail = new obstacleNail();
        addObject(obstacleNail,401,114);
        obstacleNail obstacleNail2 = new obstacleNail();
        addObject(obstacleNail2,187,343);
        obstacleNail obstacleNail3 = new obstacleNail();
        addObject(obstacleNail3,177,372);
        obstacleNail obstacleNail4 = new obstacleNail();
        addObject(obstacleNail4,154,389);
        obstacleNail obstacleNail5 = new obstacleNail();
        addObject(obstacleNail5,774,347);

        Monster monster = new Monster();
        addObject(monster,245,170);
        Monster monster2 = new Monster();
        addObject(monster2,681,514);
        Monster monster3 = new Monster();
        addObject(monster3,804,284);
        Monster monster4 = new Monster();
        addObject(monster4,72,503);
        obstacleNail obstacleNail6 = new obstacleNail();
        addObject(obstacleNail6,604,363);
        obstacleNail obstacleNail7 = new obstacleNail();
        addObject(obstacleNail7,415,560);
        obstacleNail obstacleNail8 = new obstacleNail();
        addObject(obstacleNail8,146,112);
        obstacleNail8.setLocation(48,282);
        obstacleNail obstacleNail9 = new obstacleNail();
        addObject(obstacleNail9,179,367);
        obstacleNail9.setLocation(176,371);
        obstacleNail obstacleNail10 = new obstacleNail();
        addObject(obstacleNail10,584,16);
    }   
}
