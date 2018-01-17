package room;

import java.util.HashMap;
import java.util.Map;

public class Room {
    
    HashMap<String, Integer> roomTreasure;
    String enemy;

    public Room(){
        roomTreasure = new HashMap<>();
    }
    

    public void setTreasure(String treasure, Integer value) {
        roomTreasure.put(treasure, value);
    }

    public Map<String, Integer> getTreasure() {
        return roomTreasure;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public String getEnemy() {
        return this.enemy;
    }
}
