package lab01.prob5;

public class Prob5 {

    public static void main(String[] args) {
        Prob5 obiect = new Prob5();
        obiect.comparatie(3, 4);
        obiect.comparatie(2, 10);
        obiect.comparatie(5, 0);
        obiect.comparatie(4, 8);
    }

    void comparatie(int baza, int exp) {
        int rezObtinut = this.powInt(baza, exp);
        double rezMath = Math.pow(baza, exp);

        String verdict = (rezObtinut == (int) rezMath) ? " egale" : " diferite";

        System.out.println(rezObtinut + " vs " + rezMath + verdict);
    }

    int powInt(int baza, int exp) {
        // cazul de baza
        if (exp == 0) {
            return 1;
        } else {
            return baza * powInt(baza, exp - 1);
        }
    }

}