package lab03.prob02;

public class Produs {

    String nume;
    double pret;
    int cantitate;

    Produs(String nume, double pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    double getTotalProdus() {
        return this.pret * this.cantitate;
    }

    @Override
    public String toString() {
        return " * " + this.nume + ", pret " + this.pret + " RON, " + this.cantitate + " buc";
    }
}