package lab08.prob05;

import java.util.*;

public class Magazin {

    HashMap<String, Produs> produse = new HashMap<>();

    public class Produs {

        String nume;
        double pretVechi;
        double pretNou;
        int stoc;
        boolean redus;

        public Produs(String nume, double pret, int stoc) {
            if (nume == null || nume.trim().isEmpty()) {
                throw new IllegalArgumentException("Numele nu poate fi null sau vid");
            }
            if (pret < 0) {
                throw new IllegalArgumentException("Pretul nu poate fi negativ!");
            }
            if (stoc < 0) {
                throw new IllegalArgumentException("Stocul nu poate fi negativ");
            }

            this.nume = nume;
            this.pretNou = pret;
            this.pretVechi = pret;
            this.stoc = stoc;
            this.redus = false;
        }

        @Override
        public String toString() {
            return String.format("%s | Pret: %.2f RON (Initial: %.2f RON) | Stoc: %d | Redus: %b",
                    nume, pretNou, pretVechi, stoc, redus);
        }
    }

    public void adaugaProdus(String cod, String nume, double pret, int stoc) {
        produse.put(cod, new Produs(nume, pret, stoc));
    }

    void aplicReduceriStocMic() {
        Iterator<Produs> it = produse.values().iterator();

        while (it.hasNext()) {
            Produs p = it.next();
            if (p.stoc < 50 && !p.redus) {
                p.pretNou = p.pretVechi * 0.85;
                p.redus = true;
            }
        }
    }

    void afiseazaInventar() {
        Iterator<Map.Entry<String, Produs>> it = produse.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<String, Produs> entry = it.next();
            String cod = entry.getKey();
            Produs p = entry.getValue();

            System.out.println("Produs: " + p + ", cod: " + cod);
        }
    }
}
