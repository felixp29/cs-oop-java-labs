package lab05.prob01;

/*
 * 1. Blocurile Statice: static { ... }
 * MEREU se execută mai intai TOATE blocurile static (de la Parinte la Copii) O SINGURĂ DATĂ,
 * în momentul în care clasa este încărcată de JVM în memorie.
 * Se folosesc pentru a inițializa variabile statice.
 * Regulă: Nu pot accesa decât membri statice.
 *
 * 2. Blocurile de Instanță: { ... } si constructorii
 * Se execută la FIECARE apelare de new (de fiecare dată când creezi un obiect).
 * Codul din ele rulează automat, exact înainte de a se executa constructorul clasei.
 *
 *
 * Ordinea este:
 *  Etapa 1: Blocurile STATICE (de la Parinte -> Copil)
 *  Etapa 2: Blocurile de INSTANTA (de la Parinte -> Copil)
 *
 * În interiorul aceleiași clase, blocurile de același tip se execută în ordinea în care
 * au fost scrise (de sus în jos).
 */

/**
 *
 * @author Nan Mihai
 */
class Animal {
    private static String nume;
    private static String culoare;

    static {
        System.out.println("Bloc 2 - Animal");
    }

    {
        System.out.println("Bloc 1 - Animal");
        nume = "Animal";
        culoare = "negru";
    }
    
    public String getCuloare() {
         return culoare;
    }
}

class Caine extends Animal {
    private static String tipRasa;
    
    {
        tipRasa = "medie";
        System.out.println("Bloc 1 - Caine " + getCuloare());
    }
    
    static {
        System.out.println("Bloc 2 - Caine");
    }

    {
        System.out.println("Bloc 4 - Caine");
        tipRasa = "mica";
    }
    
    {
        System.out.println("Bloc 3 - Caine");
        tipRasa = "mare";
    }
}

class SharPei extends Caine {
    private static int varsta;
    private static String taraProvenienta;
    
    static {
        System.out.println("Bloc 1 - SharPei");
        taraProvenienta = "China";
    }
    
    static {
        System.out.println("Bloc 2 - SharPei " + taraProvenienta);
    }
    
    {
        varsta = 5;
        System.out.println("Bloc 3 - SharPei " + varsta);
    }
}

class Problema1 {
    public static void main(String args[]) {
        SharPei cutu = new SharPei();
    }
}