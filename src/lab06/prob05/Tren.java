package lab06.prob05;

import java.util.*;

public class Tren implements Comparable<Tren> {

    Vector<Vagon> vagoane;

    public Tren(Vector<Vagon> v) {
        this.vagoane = v;
    }

    public Tren() {
        this.vagoane = new Vector<>();
    }

    public void addVagon(Vagon vagon) {
        vagoane.add(vagon);
    }

    public String toString() {
        return "Trenul contine vagoanele: \n" + vagoane + "\nTotal colete: " + calculeazaTotalColete();
    }

    public int calculeazaTotalColete() {
        int totalColete = 0;
        for (int i = 0; i < vagoane.size(); i++) {
            totalColete = totalColete + vagoane.get(i).getColete();
        }
        return totalColete;
    }

    @Override
    public int compareTo(Tren t) {
        return Integer.compare(this.calculeazaTotalColete(), t.calculeazaTotalColete());
    }


}
