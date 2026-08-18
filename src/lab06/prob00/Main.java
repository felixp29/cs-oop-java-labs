package lab06.prob00;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        // Comparator pentru numere intregi in ordine descrescatoare
        Comparator descrescator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2.compareTo(i1);
            }
        };

        // Comparator pentru ordinea alfabetica a prenumelor
        Comparator alfabeticAZ = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String name1 = (String) o1;
                String name2 = (String) o2;
                return name1.compareTo(name2);
                // return name2.compareTo(name1); // ordine Z -> A
            }
        };

        SortedVector vectorSortat = new SortedVector(descrescator);
        vectorSortat.add(19);
        vectorSortat.add(5);
        vectorSortat.add(22);
        vectorSortat.add(37);
        vectorSortat.add(1);

        System.out.println(vectorSortat);

        SortedVector catalog = new SortedVector(alfabeticAZ);
        catalog.add("Alia");
        catalog.add("Ioan");
        catalog.add("Victor");
        catalog.add("Jeremy");
        catalog.add("Daniela");

        System.out.println(catalog);

        Pair fructe = new Pair("mere", "cartof");
        Pair legume1 = new Pair("pere", "cartof");
        Pair legume2 = new Pair("morcov", "varza");
        Pair legume3 = new Pair("morcov", "varza");
        Pair numere1 = new Pair(4.551, 2000);
        Pair numere2 = new Pair(4.552, 2000);
        Pair numere3 = new Pair(33, 9.1);
        Pair numere4 = new Pair(33.0, 9.1);
        Pair caractere1 = new Pair('@', 'f');
        Pair caractere2 = new Pair('@', 'f');
        Pair caractere3 = new Pair('2', '#');
        Pair caractere4 = new Pair('2', '&');

        System.out.println(caractere1);
        System.out.println(caractere3);
        System.out.println(legume2);
        System.out.println(numere2);

        System.out.println(fructe.equals(legume1));
        System.out.println(legume2.equals(legume3));
        System.out.println(numere1.equals(numere2));
        System.out.println(numere3.equals(numere4));
        System.out.println(caractere1.equals(caractere2));
        System.out.println(caractere3.equals(caractere4));

        Comp1 perechePrimulObiect = new Comp1();
        Comp2 perecheAlDoileaObiect = new Comp2();
        System.out.println(perechePrimulObiect.compare(legume2, legume3));
        // ClassCastException, 33 e Integer, 33.0 e Double
        // System.out.println(perechePrimulObiect.compare(numere3, numere4));
        System.out.println(perechePrimulObiect.compare(numere1, numere2));
        System.out.println(perecheAlDoileaObiect.compare(caractere3, caractere4));
        System.out.println(perecheAlDoileaObiect.compare(caractere1, caractere2));
        System.out.println(perechePrimulObiect.compare(caractere2, caractere4));
        System.out.println(perecheAlDoileaObiect.compare(caractere2, caractere4));


        SortedVector vector1 = new SortedVector(new Comp1());
        SortedVector vector2 = new SortedVector(new Comp2());
        vector1.add(new Pair("anaconda", 4));
        vector1.add(new Pair("tricicleta", 8));
        vector1.add(new Pair("ciclop", 72));
        vector1.add(new Pair("braconaj", 19));
        vector1.add(new Pair("zeama", 23));

        vector2.add(new Pair("ciocolata", 23));
        vector2.add(new Pair("intuitie", 31));
        vector2.add(new Pair("intuit", 5));
        vector2.add(new Pair("antichitate", 23));


        System.out.println(vector1);
        System.out.println(vector2);
    }
}
