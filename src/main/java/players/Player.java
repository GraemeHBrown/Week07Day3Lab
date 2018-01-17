package players;

public abstract class Player {

    protected String name;
    protected int healthPoints;

    public Player (String name){
        this.name = name;
        this.healthPoints = 0;
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
}

// TODO check for negative healthPoints values.