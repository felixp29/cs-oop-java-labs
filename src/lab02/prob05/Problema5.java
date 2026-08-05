package lab02.prob05;

public class Problema5 {

    public static void main(String[] args) {
        String text = "Un terorist avea o bomba";
        String[] cuvinte = new String[2];
        cuvinte[0] = "terorist";
        cuvinte[1] = "bomba";

        Problema5 prb5 = new Problema5();
        String rezultat;
        rezultat = prb5.cenzurare(text, cuvinte);
    }

    String cenzurare(String text, String[] cuvinte) {

        return " ";
    }
}
