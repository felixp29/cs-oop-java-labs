package lab05.prob03;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class Main {

    private static Vector<Integer> nrPozitive = new Vector<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            myRead(scanner);
        }
        catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();

        // verific daca utilizatorul a introdus macar un numar pozitiv
        if (!nrPozitive.isEmpty()) {
            System.out.println("Maximul este " + Collections.max(nrPozitive));
        }
        else {
            System.out.println("Nu s-a introdus niciun numar pozitiv");
        }
    }

    public static void myRead(Scanner scanner) throws NegativeNumberException {
        System.out.print("Introduceti un numar intreg pozitiv (un numar negativ opreste citirea): ");

        // while (scanner.hasNextInt())
        while (true) {
            // Citesc toata linia si elimin cu trim() spatiile normale, \t, \n ale sirului de caractere
            String input = scanner.nextLine().trim();

            try {
                int numarCurent = Integer.parseInt(input);

                if (numarCurent < 0) {
                    throw new NegativeNumberException();
                }

                nrPozitive.add(numarCurent);
                System.out.println("Numarul introdus este " + numarCurent + " si este pozitiv");

            } catch (NumberFormatException e) {
                System.out.println("Nu ati introdus un numar intreg!");
            }
        }
    }
}
