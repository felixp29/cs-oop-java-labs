package lab06.prob03;

import java.util.Vector;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Vector<Student> catalog = new Vector<>();

        Student s1 = new Student("Ionescu George");
        s1.addMedie(8.5);
        s1.addMedie(9.0); // Medie = 8.75

        Vector<Double> mediiMaria = new Vector<>();
        mediiMaria.add(7.0);
        mediiMaria.add(10.0);
        mediiMaria.add(9.5); // Medie = 8.83333
        Student s2 = new Student("Popescu Maria", mediiMaria);

        Student s3 = new Student("Ardeleanu Alexandru");
        s3.addMedie(6.5);
        s3.addMedie(7.0);
        s3.addMedie(9.5);
        s3.addMedie(8.0); // Medie = 7.75

        Student s4 = new Student("Stanescu Marius");
        s4.addMedie(10.0);
        s4.addMedie(10.0);
        s4.addMedie(8.5);
        s4.addMedie(9.0); // Medie = 9.375

        Student s5 = new Student("Popescu Maria");
        s5.addMedie(10.0);
        s5.addMedie(7.5);
        s5.addMedie(9.0);
        s5.addMedie(8.0); // Medie = 8.625

        catalog.add(s1);
        catalog.add(s2);
        catalog.add(s3);
        catalog.add(s4);
        catalog.add(s5);

        System.out.println("Catalog inainte de sortare: ");
        System.out.println(catalog);

        System.out.println("Catalogul dupa sortare: ");
        Collections.sort(catalog);
        System.out.println(catalog);
    }
}
