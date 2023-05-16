import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Castle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondStage extends World
{
    public int randomX(){
        return Greenfoot.getRandomNumber(700);
    }
    
    public int randomY(){
        return Greenfoot.getRandomNumber(500);
    }
    
    public SecondStage(User user, Hearts myHp, Counter score, MessageDisplayer message)
    {    
        super(850, 600, 1); 
        prepare(user, myHp, score, message);
    }

    private GreenfootSound backgroundSound = new GreenfootSound("backGround.mp3");
  
    private void prepare(User user, Hearts myHp, Counter score, MessageDisplayer message){

        addObject(user, 251,225);
        addObject(myHp, 90,30);
        addObject(score, 425,30);
        addObject(message, 425,200);

        backgroundSound.setVolume(30);
        backgroundSound.playLoop();
        
        Monster monster = new Monster();
        addObject(monster,randomX(),randomY());
        
        Monster monster1 = new Monster();
        addObject(monster1,randomX(),randomY());
        
        Monster monster2 = new Monster();
        addObject(monster2,randomX(),randomY());
        
        Monster monster3 = new Monster();
        addObject(monster3,randomX(),randomY());
        
        Monster monster4 = new Monster();
        addObject(monster4,randomX(),randomY());
        
        Monster monster5 = new Monster();
        addObject(monster5,randomX(),randomY());
        
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
    }
}
