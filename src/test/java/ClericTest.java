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

}
