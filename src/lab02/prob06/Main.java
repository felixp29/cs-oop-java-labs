package lab02.prob06;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector vector = new Vector();
        vector.add(7.5);
        vector.add("4542");
        vector.add(931);
        vector.add("String");
        vector.add('/');
        vector.add("^+");
        vector.add(false);
        vector.add('@');
        vector.add("=");
        System.out.println(vector.get(0).getClass());
        System.out.println(vector.get(1).getClass());
        System.out.println(vector.get(2).getClass());
        System.out.println(vector.get(3).getClass());
        System.out.println(vector.get(4).getClass());
        System.out.println(vector.get(5).getClass());
        System.out.println(vector.get(6).getClass());
        System.out.println(vector.get(7).getClass());
        System.out.println(vector.get(8).getClass());
    }
}
