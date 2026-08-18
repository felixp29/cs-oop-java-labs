package lab06.prob00;

import java.util.Comparator;

public class Comp2 implements Comparator {

    Pair p1;
    Pair p2;

    @Override
    public int compare(Object o1, Object o2) {
        p1 = (Pair) o1;
        p2 = (Pair) o2;

        Comparable c = (Comparable) p1.o2;
        return c.compareTo(p2.o2);

    }

}
