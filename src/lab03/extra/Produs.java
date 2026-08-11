package lab03.extra;

public record Produs(String nume, double pret, TipProdus tip) {

    String descriere() {
        return "Produs: Nume = " + nume + ", Tip = " + tip + ", Pret = " + pret + " RON";
    }
}
