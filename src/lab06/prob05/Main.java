/*
 * Programare orientata pe obiecte
 * Seria CC
 * Laboratorul 6
 */

package lab06.prob05;
import java.util.Vector;
import java.util.Collections;

/**
 *
 * @author Nan Mihai
 */

public class Main
 {
    public static void main(String args[]) {

        Tren t1 = new Tren();
        Tren t2 = new Tren();

        Vector<Tren> trenuri = new Vector<>();

        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriB());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriB());
        t1.addVagon(new CalatoriB());
        t1.addVagon(new Marfa());

        t2.addVagon(new CalatoriB());
        t2.addVagon(new CalatoriB());
        t2.addVagon(new Marfa());
        t2.addVagon(new Marfa());
        t2.addVagon(new CalatoriA());
        t2.addVagon(new CalatoriB());
        t2.addVagon(new Marfa());
        t2.addVagon(new CalatoriA());
        t2.addVagon(new CalatoriB());
        t2.addVagon(new CalatoriB());
        t2.addVagon(new Marfa());

        System.out.println(t1);
        System.out.println();
        System.out.println(t2);

        if (t1.compareTo(t2) == 0) {
            System.out.println("Cele doua trenuri sunt egale");
        }
        else if (t1.compareTo(t2) > 0) {
            System.out.println("Primul tren poate transporta mai multe colete");
        }
        else {
            System.out.println("Al doilea tren poate transporta mai multe colete");
        }

        trenuri.add(t1);
        trenuri.add(t2);
        Collections.sort(trenuri);
        System.out.println("Trenurile in ordinea capcitatii de transport colete: ");
        System.out.println(trenuri);

    }
}
