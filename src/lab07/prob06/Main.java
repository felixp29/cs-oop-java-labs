package lab07.prob06;

import java.io.IOException;

// import static lab07.prob06.LruCache.printCache;
// import static lab07.prob06.LruCache.runOps;

public class Main {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Utilizare: java Main <capacitate> <cale_fisier>");
            return;
        }

        try {
            int capacity = Integer.parseInt(args[0]);
            String opsFile = args[1];

            LruCache cache = LruCache.runOps(opsFile, capacity);
            System.out.println("---");
            LruCache.printCache(cache);

        } catch (NumberFormatException e) {
            System.out.println("Capacitatea trebuie sa fie un numar intreg");
        } catch (IOException e) {
            System.out.println("Eroare la citirea fisierului: " + e.getMessage());
        }
    }
}
