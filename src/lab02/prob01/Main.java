package lab02.prob01;

public class Main {

    static String s1 = "sis";
    static String s2 = "sisisiisis";

    public static void main(String[] args) {
        Main obiect = new Main();
        System.out.println("Cu suprapunere folosind substring(): ");
        obiect.numarAparitiiV1(s1, s2);
        System.out.println("Fara suprapunere folosind substring(): ");
        obiect.numarAparitiiV1FaraSuprapunere(s1, s2);
        System.out.println("Cu suprapunere folosind indexOf(): ");
        obiect.numarAparitiiV2CuSuprapunere(s1, s2);
        System.out.println("Fara suprapunere, folosind indexOf() ");
        obiect.numarAparitiiV2FaraSuprapunere(s1, s2);
    }

    void numarAparitiiV1(String s1, String s2) {
        int count = 0;

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (s1.equals(s2.substring(i, i + s1.length()))) {
                count++;
            }
        }
        System.out.println(count);
    }

    void numarAparitiiV1FaraSuprapunere(String s1, String s2) {
        int count = 0;
        int i = 0;
        while (i <= s2.length() - s1.length()) {
            if (s1.equals(s2.substring(i, i + s1.length()))) {
                count++;
                i = i + s1.length();
            } else {
                i++;
            }
        }
        System.out.println(count);
    }

    void numarAparitiiV2CuSuprapunere(String s1, String s2) {
        int count = 0;
        int pos = s2.indexOf(s1); // caut prima aparitie - pornesc de la index 0

        while (pos != -1) {
            count++;
            /* caut urmatoarele aparitii, fara sa le repet pe cele gasite deja
             * - iau de la indexul pos + 1 la urmatorul pas al while-ului
             */
            pos = s2.indexOf(s1, pos + 1);
        }
        System.out.println(count);
    }

    void numarAparitiiV2FaraSuprapunere(String s1, String s2) {
        int count = 0;
        int pos = s2.indexOf(s1);

        while (pos != -1) {
            count++;
            pos = s2.indexOf(s1, pos + s1.length());
        }
        System.out.println(count);
    }
}