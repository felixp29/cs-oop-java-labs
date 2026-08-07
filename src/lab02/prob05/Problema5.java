package lab02.prob05;

public class Problema5 {

    public static void main(String[] args) {
        String text = "Un copil avea o bomboana. Teroristul i-o fura. Doi teroristi au o bomba";
        String[] cuvinte = new String[5];
        cuvinte[0] = "terorist";
        cuvinte[1] = "teroristul";
        cuvinte[2] = "Teroristul";
        cuvinte[3] = "terorist";
        cuvinte[4] = "bomba";

        Problema5 prb5 = new Problema5();
        String rezultat;
        rezultat = prb5.cenzurare(text, cuvinte);
        System.out.println(rezultat);
    }

    String cenzurare(String text, String[] cuvinte) {
        boolean suspect = false;

        // 1. Verific daca textul contine cel putin un cuvant suspect
        for (int i = 0; i < cuvinte.length; i++) {
            if (text.contains(cuvinte[i])) {
                suspect = true;
                break; // am gasit cel putin un cuvant suspect, pot opri cautarea
            }
        }

        // 2. Afisez daca textul e suspect sau nu. Daca e suspect il cenzurez
        if (suspect) {
            System.out.println("Text suspect");
            for (int i = 0; i < cuvinte.length; i++) {
                String cuvantDeInlocuit = cuvinte[i];
                int lungime = cuvantDeInlocuit.length();
                String cenzura;

                if (lungime > 2) {
                    char primaLitera = cuvantDeInlocuit.charAt(0);
                    char ultimaLitera = cuvantDeInlocuit.charAt(lungime - 1);
                    cenzura = primaLitera + "*".repeat(lungime - 2) + ultimaLitera;
                } else {
                    cenzura = "*".repeat(lungime);
                }

                text = text.replace(cuvantDeInlocuit, cenzura);
            }
        } else {
            System.out.println("Nimic suspect");
        }
        return text;
    }
}
