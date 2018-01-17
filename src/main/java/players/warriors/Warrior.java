package players.warriors;

import players.Player;

public class Warrior extends Player {

    protected String weapon;

    public Warrior(String name){
        super(name);

    }


    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }
}
