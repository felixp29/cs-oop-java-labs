package lab06.prob05;

public class Marfa extends Vagon {

    public Marfa(int p, int c) {
        super(p, c);
    }

    // Vagon tip Marfa are capacitatea de 400 colete poștale
    public Marfa() {
        super(0, 400);
    }

    @Override
    public void deschidereUsi() {
        System.out.println("Usile se deschid manual");
    }

    @Override
    public void inchidereUsi() {
        System.out.println("Usile se inchid manual");
    }

    @Override
    public String toString() {
        return "\nVagon de tip Marfa cu capacitate: " + getPasageri() + " pasageri, " + getColete() + " colete";
    }

}
