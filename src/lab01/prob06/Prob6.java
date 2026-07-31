package lab01.prob06;

public class Prob6 {

    public static void main(String[] args) {
        Prob6 numar = new Prob6();
        for (int i = 1; i <= 20; i++) {
            if (numar.isPrime(i)) {
                System.out.println(i + " e prim");
            } else {
                System.out.println(i + " nu e prim");
            }
        }

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
