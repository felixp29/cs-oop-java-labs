package lab02.prob02;

import java.util.StringTokenizer;

public class Main {

    static String s1 = "sir1 si sir2 sunt 2 siruri";
    static String s2 = "sir";
    static String s3 = "Marius, de ce nu l-ai ajutat pe George? Era de datoria ta sa vezi ce poti face.";
    static String s4 = "l";

    public static void main(String[] args) {
        Main obiect = new Main();
        System.out.println(obiect.numarAparitiiV1(s1, s2));
        System.out.println(obiect.numarAparitiiV2(s3, s4));
    }

    int numarAparitiiV1(String s1, String s2) {
        String[] cuvinte = s1.split(" ");
        int count = 0;
        for (int i = 0; i < cuvinte.length; i++) {
            if (s2.equals(cuvinte[i])) {
                count++;
            }
        }
        return count;
    }

    int numarAparitiiV2(String s3, String s4) {
        StringTokenizer st = new StringTokenizer(s3, " :,.-?\n");
        int count = 0;

        while (st.hasMoreTokens()) {
            if (s4.equals(st.nextToken())) {
                count++;
            }
        }
        return count;
    }
}
