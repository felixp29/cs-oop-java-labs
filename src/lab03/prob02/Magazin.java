package lab03.prob02;

public class Magazin {

    // Relatie de compoziție (relația Has-A):
    // Clasa Magazin conține ca atribute trei instanțe ale clasei Produs.
    String nume;
    Produs p1;
    Produs p2;
    Produs p3;

    Magazin(String nume, Produs p1, Produs p2, Produs p3) {
        this.nume = nume;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getTotalMagazin() {
        return p1.getTotalProdus() + p2.getTotalProdus() + p3.getTotalProdus();
    }

    @Override
    public String toString() {
        return "Magazinul " + nume + " contine produsele: " + "\n"
                + p1 + "\n" + p2 + "\n" + p3 + "\n"
                + "Total magazin: " + getTotalMagazin() + " RON";
    }

    public static void main(String[] args) {
        Magazin m1 = new Magazin("NextGen Gaming",
                new Produs("tastatura RGB", 119.90, 41),
                new Produs("mouse gaming", 80.0, 50),
                new Produs("monitor 165GHz",499.90, 17)
        );

        Magazin m2 = new Magazin("Crăița Market",
                new Produs("masline verzi", 4.5, 183),
                new Produs("oua", 1.79, 89),
                new Produs("lapte de capra", 9.33, 19)
        );

        System.out.println(m1);
        System.out.println();
        System.out.println(m2);
    }
}