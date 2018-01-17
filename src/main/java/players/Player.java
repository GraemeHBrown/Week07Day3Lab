package players;

import java.util.HashMap;

public abstract class Player {

    protected String name;
    protected int healthPoints;
    protected HashMap<String, Integer> treasureChest;


    public Player (String name){
        this.name = name;
        this.healthPoints = 0;
        treasureChest = new HashMap();
    }


    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int addPoints) {
        this.healthPoints += addPoints;
    }

    public void addTreasure(String treasure, Integer value) {
        this.treasureChest.put(treasure,  value);
    }

    public int getAllTreasureValue() {
        Integer treasureSum = 0;
        for (Integer treasure : treasureChest.values()){
           treasureSum  += treasure;
        }
        return treasureSum;

    }
}

//    Integer integerSum = integers.values().stream().mapToInt(Integer::intValue).sum();

// TODO check for negative healthPoints values.
// TODO remove treasure