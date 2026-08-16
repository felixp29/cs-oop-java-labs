package lab06.prob02;

import lab06.prob01.Circle;
import lab06.prob01.Rectangle;
import lab06.prob01.Shape;
import lab06.prob01.Square;

public class Main {

    public static void main(String[] args) {

        Rectangle object1 = new Rectangle(4, 9, "blue", true);
        // Rectangle object2 = new Shape(); // Shape is abstract; cannot be instantiated
        Shape object2 = new Rectangle(6, 2.7); // but not "new Shape();
        Rectangle object3 = new Square();
        Rectangle object4 = new Square(9);
        Rectangle object5 = new Square(8.1, "green", false);
        // Rectangle object6 = new Circle();

        Circle object6 = new Circle(7, "black", true);
        Square object7 = new Square(3.3, "white", false);
        Rectangle object8 = new Rectangle(7.5, 5.8, "yellow", false);

        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);
        System.out.println(object4);
        System.out.println(object5);
        System.out.println(object6);
        System.out.println(object7);
        System.out.println(object8);

        Circle c1 = new Circle();
        Square sq;
        // Conversie 1 - does not compile (Inconvertible types)
        // instaceof doesn't work. instanceof e folosit cand exista un grad de rudenie intre obj si clasa
        // if (c1 instanceof Square) {
        //    sq = (Square) c1;
        // }

        Shape ref1 = c1;
        if (ref1 instanceof Square) {
            sq = (Square) ref1;
        } else {
            System.out.println("Conversia 1 invalida: obiectul este Circle, nu Square!");
        }

        // Conversie 2 - Downcasting. compiles but throws exception at runtime "ClassCastException"
        // Downcasting from square --> rectangle
        Rectangle r = new Rectangle(5.0, 5.0);
        if (r instanceof Square) {
            sq = (Square) r;
            System.out.println(sq);
        }

        if (r instanceof Square) {
            sq = (Square) r;
            System.out.println("Conversie 2 reusita: " + sq);
        } else {
            System.out.println("Conversia 2 evitata: r este Rectangle curat, nu Square!");
        }

        // Conversie 3 - Upcasting. compiles and runs - rectangle-->square
        sq = new Square(7.0);
        if (r instanceof Square) {
            r = sq;
            System.out.println(r);
        }

        System.out.println("Am ajuns aici");
    }
}
