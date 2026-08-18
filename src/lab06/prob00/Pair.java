package lab06.prob00;


public class Pair {

    Object o1;
    Object o2;

    public Pair(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if ( !(o instanceof Pair)) {
            return false;
        }
        Pair p = (Pair) o; // Downcast
        return p.o1.equals(this.o1) && p.o2.equals(this.o2);
    }

    @Override
    public String toString() {
        return o1 + " - " + o2;
    }
}
