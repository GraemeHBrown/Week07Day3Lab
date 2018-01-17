import org.junit.Before;
import org.junit.Test;
import players.clerics.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric1;

    @Before
    public void before(){
        cleric1 = new Cleric("Healer Harris");
    }

    @Test
    public void hasName(){
        assertEquals("Healer Harris", cleric1.getName());
    }

    @Test
    public void newPlayerHasZeroHealthPoints(){
        assertEquals(0, cleric1.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        cleric1.setHealthPoints(20);
        assertEquals(20, cleric1.getHealthPoints());
    }

}
