package lab07.prob02;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        LinkedSet s = new LinkedSet();

        // 1) add(Object) — unicitate + ordinea inserarii
        System.out.println("add A -> " + s.add("A"));
        System.out.println("add A -> " + s.add("A"));
        s.add("B");
        s.add("C");
        System.out.println("Set: " + s);

        // 2) add(int, Object) — nu insereaza duplicate
        s.add(1, "X");
        s.add(2, "B");
        System.out.println("Dupa add(index,...): " + s);

        // 3) set(int, Object) — blocare daca ar crea duplicat
        try {
            s.set(0, "B");
            System.out.println("SET REUSIT (NU AR TREBUI)");
        } catch (IllegalArgumentException ex) {
            System.out.println("set duplicat blocat: " + ex.getMessage());
        }

        Object old = s.set(1, "Z");
        System.out.println("set(1,'Z') a inlocuit: " + old);
        System.out.println("Dupa set legal: " + s);

        // 4) iterator().remove() — eliminare in timpul parcurgerii
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Object e = it.next();
            if ("Z".equals(e)) it.remove();
        }
        System.out.println("Dupa iterator.remove(Z): " + s);

        // 5) equals/hashCode ca Set (ordine ignorata)
        LinkedSet t = new LinkedSet();
        t.add("C"); t.add("A"); t.add("B");
        System.out.println("equals ca Set (true): " + s.equals(t));
        System.out.println("hashCode s/t: " + s.hashCode() + " / " + t.hashCode());
    }
}
