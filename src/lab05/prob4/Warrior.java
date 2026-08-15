package lab05.prob4;

/**
 * 
 */
public class Warrior {

    private String name;
    private double health;
    private double damage;

    public Warrior (String name, double health, double damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    // 0 = dead, 100 = full health
    public double getHealth() {
        return this.health;
    }

    public double getDamage() {
        return this.damage;
    }

    @Override
    public String toString() {
        String output = "";
        output = getName() + " [" + getDamage() + " DPS, " + getHealth()
                + " HP] " + getClass().getSimpleName() + "\n";
        return output;
    }
}
