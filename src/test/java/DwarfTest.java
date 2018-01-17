import org.junit.Before;
import org.junit.Test;
import players.warriors.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Daryl");

    }


    @Test
    public void canSetWeapon(){
        dwarf.setWeapon("Club");
        assertEquals("Club", dwarf.getWeapon());
    }

}
