package lab06.prob00;

import java.util.Vector;
import java.util.Comparator;
import java.util.Collections;

public class SortedVector extends Vector {

    Comparator c;

    public SortedVector(Comparator c) {
        this.c = c;
    }

    public SortedVector() {
        this(null);
    }

    @Override
    public boolean add(Object o) {
        super.add(o);
        Collections.sort(this, c);
        return true;
    }
}

