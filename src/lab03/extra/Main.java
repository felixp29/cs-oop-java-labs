package lab03.extra;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Produs p1 = new Produs("Laptop", 7200.0, TipProdus.ELECTRONIC);
        Produs p2 = new Produs("Hanorac", 109.90, TipProdus.VESTIMENTAR);
        Produs p3 = new Produs("Cereale ovaz", 5.99, TipProdus.ALIMENTAR);
        Produs p4 = new Produs("Amandina", 9.90, TipProdus.ALIMENTAR);
        Produs p5 = new Produs("Perna", 24.5, TipProdus.ALTUL);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println(p3.nume());
        System.out.println(p1.pret());
        System.out.println(p4.tip());

        System.out.println(p1.descriere());
        System.out.println(p2.descriere());
        System.out.println(p3.descriere());
        System.out.println(p4.descriere());
        System.out.println(p5.descriere());

        ArrayList<Produs> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        System.out.println();
        System.out.println("Produsele de tip ALIMENTAR din recordul Produs sunt:");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).tip() == TipProdus.ALIMENTAR) {
                System.out.println(list.get(i).descriere());
            }
        }
    }
}
