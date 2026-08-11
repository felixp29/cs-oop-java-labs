package lab03.prob01;

public class Fractie {

    int numarator;
    int numitor;

    Fractie(int numarator, int numitor) {
        this.numarator = numarator;
        this.numitor = numitor;
        simplifica();
    }

    Fractie() {
        this(0, 1);
    }

    /* Implementez o metoda privata pt reducere la fractii ireductibile
     * O voi apela direct din constructor, astfel orice obiect de tip Fractie va
     * fi garantat ireductibil inca de la creare (nu mai stau sa o apelez in
     * toString() sau in sumaFractie() etc)
     * Folosesc Algoritmul lui Euclid pt calcularea CMMDC:
     * cel mai mare divizor comun dintre două numere a și b este
     * același cu cel mai mare divizor comun dintre b și restul împărțirii lui a la b (a % b).
     * Deci, o sa micsorez numerele la fiecare pas prin inlocuirea cu restul impartirii, pana cand r = 0
     */
    private int cmmdc(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void simplifica() {
        int div = cmmdc(this.numarator, this.numitor);
        if (div > 1) { // altfel sunt prime intre ele
            this.numarator = this.numarator / div;
            this.numitor /= div;
        }
    }

    public Fractie sumaFractie(Fractie f) {
        int sus = this.numarator * f.numitor + f.numarator * this.numitor;
        int jos = this.numitor * f.numitor;
        return new Fractie(sus, jos);
    }

    @Override
    public boolean equals(Object o) {
        // optimizare de viteza
        // verific daca ambele variabile pointeaza catre aceeasi adresa de memorie
        if (this == o) return true;

        // daca obiectul primit ca parametru este null => nu exista
        // un obiect din clasa mea (this) nu poate fi egal cu null
        if (o == null || getClass() != o.getClass()) return false;

        // downcasting (pt ca am verificat anterior ca Object e de tip Fractie
        Fractie f = (Fractie) o;

        // compararea efectiva a fractiilor
        // doua fractii a/b si c/d sunt egale daca a * d == b * c
        return this.numarator * f.numitor == f.numarator * this.numitor;
    }

    @Override
    public String toString() {
        return numarator + "/" + numitor;
    }
}