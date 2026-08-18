package lab06.prob00;

import java.util.Comparator;

public class Comp1 implements Comparator {

    public int compare(Object o1, Object o2) {
        Pair p1 = (Pair) o1;
        Pair p2 = (Pair) o2;

        Comparable c1 = (Comparable) p1.o1;
        return c1.compareTo(p2.o1);
    }
}
