package lab01.prob07;

public class Prob7 {

    public static void main(String[] args) {

    }

    boolean isPrime(int n) {
        // numerele <= 0 nu sunt prime
        // cerinta: Considerați numărul 1 ca fiind număr prim.
        if (n == 0) {
            return false;
        }

        // verific toti divizorii lui i de la 2 pana la sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
