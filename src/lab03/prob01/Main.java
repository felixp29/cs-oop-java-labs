package lab03.prob01;

public class Main {

    public static void main(String[] args) {
        Fractie f1 = new Fractie(1, 2);
        Fractie f2 = new Fractie(7, 11);
        Fractie f3 = new Fractie(3, 4);
        Fractie f4 = new Fractie(7, 11);
        Fractie fImplicita = new Fractie();

        System.out.println("1/2 + 7/11 = " + f1.sumaFractie(f4));
        System.out.println("3/4 + 1/2 = " + f3.sumaFractie(f1));
        System.out.println("is 3/4 equal to 7/11? " + f3.equals(f4));
        System.out.println("is 7/11 equal to 7/11? " + f2.equals(f4));
        System.out.println("apelare construtor fara parametri: " + fImplicita);
    }
}