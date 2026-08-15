package lab05.prob4;

public class Main {

    public static void main(String[] args) {

        WarriorPack warriorPack = new WarriorPack();

        warriorPack.addWarrior(new SnakeWarrior("Tyrthas", 100));
        warriorPack.addWarrior(new OgreWarrior("Dunimm", 100));
        warriorPack.addWarrior(new MarshmallowManWarrior("Puffington", 100));

        System.out.println(warriorPack);

        // System.out.println(warriorPack.getWarriors());

        System.out.println("Total Pack Damage: " + warriorPack.calculateDamage());
    }
}
