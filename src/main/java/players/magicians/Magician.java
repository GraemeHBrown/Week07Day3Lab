package players.magicians;

import players.Player;

public abstract class Magician extends Player {

    String spell;
    String magicalCreature;

    public Magician(String name){
        super(name);


    }


    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getSpell() {
        return this.spell;
    }

    public void setMagicalCreature(String magicalCreature) {
        this.magicalCreature = magicalCreature;
    }

    public String getMagicalCreature() {
        return this.magicalCreature;
    }
}
