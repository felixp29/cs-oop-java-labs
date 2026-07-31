package lab01.prob02;

public class Prob2 {

    public static void main(String[] args) {
        Prob2 obiect = new Prob2();
        obiect.printInt(42);
        obiect.printInt(7 + 5);
        obiect.printInt(3 * 10);
    }

    void printInt(int number) {
        System.out.println(number);
    }
}
