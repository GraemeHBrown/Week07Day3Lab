import org.junit.Before;
import org.junit.Test;
import room.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Room();
    }

    @Test
    public void hasTreasure(){
        room.setTreasure("Gems", 10);
        assertEquals(10, room.getTreasure().get("Gems"), 0.01);
    }

    @Test
    public void hasEnemy(){
        room.setEnemy("Ogre");
        assertEquals("Ogre", room.getEnemy());
    }



}
