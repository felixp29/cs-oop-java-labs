package lab06.prob05;

public class CalatoriB extends Vagon {

    public CalatoriB(int p, int c) {
        super(p, c);
    }

    // Vagon tip CalatoriB are capacitatea de 50 pasageri și 400 colete poștale
    public CalatoriB() {
        super(50, 400);
    }

    @Override
    public void deschidereUsi() {
        System.out.println("Atentie, se deschid usile!");
    }

    @Override
    public void inchidereUsi() {
        System.out.println("Atentie, se inchid usile!");
    }

    public void blocareGeamuri() {
        System.out.println("Atentie, se blocheaza geamurile!");
    }

    public String toString() {
        return "\nVagon de tip CalatoriB cu capacitate: " + getPasageri() + " pasageri, " + getColete() + " colete";
    }
}
