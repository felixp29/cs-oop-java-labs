package lab06.prob05;

public class CalatoriA extends Vagon {

    public CalatoriA(int p, int c) {
        super(p, c);
    }

    // Vagon tip CalatoriA are capacitatea de 40 pasageri și 300 colete poștale
    public CalatoriA() {
        super(40, 300);
    }

    @Override
    public void deschidereUsi() {
        System.out.println("Atentie, se deschid usile!");
    }

    @Override
    public void inchidereUsi() {
        System.out.println("Atentie, se inchid usile!");
    }

    public String toString() {
        return "\nVagon de tip CalatoriA cu capacitate: " + getPasageri() + " pasageri, "
                + getColete() + " colete";
    }
}
