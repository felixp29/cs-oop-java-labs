package lab06.prob05;

public abstract class Vagon {

    private int pasageri;
    private int colete;

    public Vagon(int pasageri, int colete) {
        this.pasageri = pasageri;
        this.colete = colete;
    }

    public void setPasageri(int pasageri) {
        this.pasageri = pasageri;
    }

    public void setColete(int colete) {
        this.colete = colete;
    }

    public int getColete() {
        return colete;
    }

    public int getPasageri() {
        return pasageri;
    }

    public abstract void deschidereUsi();
    public abstract void inchidereUsi();


}
