import org.junit.Before;
import org.junit.Test;
import players.magicians.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Warry");
    }

    @Test
    public void hasSpell(){
        warlock.setSpell("Exploding head");
        assertEquals("Exploding head", warlock.getSpell());
    }

    @Test
    public void hasMagicalCreature(){
        warlock.setMagicalCreature("Unicorn");
        assertEquals("Unicorn", warlock.getMagicalCreature());
    }
}
