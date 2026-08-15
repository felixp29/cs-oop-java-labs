package lab05.prob4;
/**
 * 
 */

import java.util.*;

public class WarriorPack {

    private Vector<Warrior> warriors;

    public WarriorPack() {
        warriors = new Vector<>();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector<Warrior> getWarriors() {
        return warriors;
    }

    public double calculateDamage() {
        double damage = 0;
        for (int i = 0; i < warriors.size(); i++) {
            damage = damage + warriors.get(i).getDamage();
        }
        return damage;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < warriors.size(); i++) {
            output = output + warriors.get(i);
        }
        return "The wrriors from your warrior pack are:\n" + output;
    }
}
