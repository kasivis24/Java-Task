abstract class Character {
    protected int hitPoints;
    protected int strength;

    abstract boolean canCarryWeapons();

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}

class Warrior extends Character {
    Warrior() {
        this.hitPoints = 100;
        this.strength = 75;
    }

    boolean canCarryWeapons() {
        return true;
    }
}

class Wizard extends Character {
    Wizard() {
        this.hitPoints = 50;
        this.strength = 25;
    }

    boolean canCarryWeapons() {
        return false;
    }
}
