package lab02.prob04;

import java.util.Vector;
// import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Vector multimea1 = new Vector();
        // Random generator = new Random();

        for (int i = 1; i <= 15; i++) {
            multimea1.add(i);
        }
        Vector multimea2 = new Vector();
        /*
        for (int i = 0; i < 15; i++) {
            int nr = generator.nextInt(30);
            multimea2.add(nr);
        }
        */
        multimea2.add(5);
        multimea2.add(2);
        multimea2.add(7);
        multimea2.add(12);
        multimea2.add(27);
        multimea2.add(18);
        multimea2.add(3);
        multimea2.add(15);
        multimea2.add(20);
        multimea2.add(30);

        System.out.println("M1: " + multimea1);
        System.out.println("M2: " + multimea2);

        // Reuniune:
        Vector reuniune = new Vector(multimea1);
        Vector multimea2FaraComune = new Vector(multimea2);
        // scot elementele din M2 care sunt si in m1 cu removeAll();
        multimea2FaraComune.removeAll(multimea1);
        reuniune.addAll(multimea2FaraComune);

        // Intersectie:
        Vector intersectie = new Vector(multimea1);
        intersectie.retainAll(multimea2);

        // Diferenta:
        Vector diferenta = new Vector(multimea1);
        diferenta.removeAll(multimea2);

        System.out.println("R: " + reuniune);
        System.out.println("I: " + intersectie);
        System.out.println("D: " + diferenta);
    }
}
