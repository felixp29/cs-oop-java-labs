package lab08.prob05;

public class Main {

    public static void main(String[] args) {

        Magazin magazin = new Magazin();

        // 1. Adaugare produse de test
        magazin.adaugaProdus("P01", "Laptop Gaming", 4500.0, 15);   // stoc < 50 (se va reduce)
        magazin.adaugaProdus("P02", "Mouse Wireless", 120.50, 80);  // stoc >= 50 (ramane neschimbat)
        magazin.adaugaProdus("P03", "Tastatura Mecanica", 350.0, 30); // stoc < 50 (se va reduce)

        System.out.println("=== INVENTAR INITIAL ===");
        magazin.afiseazaInventar();

        // 2. Aplicare reducere de 15% pentru stoc mic
        magazin.aplicReduceriStocMic();

        System.out.println("\n=== INVENTAR DUPA APLICAREA REDUCERILOR ===");
        magazin.afiseazaInventar();

        // 3. Test validare constructor (arunca exceptie)
        try {
            magazin.adaugaProdus("P04", "", -10.0, -5);
        } catch (IllegalArgumentException e) {
            System.out.println("\nExceptie prinsa cu succes: " + e.getMessage());
        }
    }
}
