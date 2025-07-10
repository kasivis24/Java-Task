interface Weapon {
    String getName();
}

 class Sword implements Weapon {
    public String getName() {
        return "Sword";
    }
}

 class Character {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        if (!canCarryWeapons()) {
            throw new IllegalArgumentException("Character cannot carry weapons");
        }
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public boolean canCarryWeapons() {
        return true;
    }
}

class Warrior extends Character {
    // Warriors can carry weapons by default
}

public class Wizard extends Character {
    @Override
    public boolean canCarryWeapons() {
        return false;  // Wizards can't carry weapons
    }
}
