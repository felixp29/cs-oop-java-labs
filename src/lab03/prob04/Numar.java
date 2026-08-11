package lab03.prob04;

public class Numar {

    int numar = 30;

    // returneaza suma dintre nr (membrul clasei) si a
    public int suma(int a) {
        return numar + a;
    }

    // returneaza suma dintre nr, a si b
    public int suma(int a, int b) {
        return suma(a) + b;
    }

    // returneaza suma dintre nr, a, b si c
    public int suma(int a, int b, int c) {
        return suma(a, b) + c;
    }

    // returneaza suma dintre nr, a, b, c si d
    public int suma(int a, int b, int c, int d) {
        return suma(a, b, c) + d;
    }
}
