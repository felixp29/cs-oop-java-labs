package lab04.prob02;

public class SortedArray extends Array {

    public SortedArray() {
        super();
    }

    @Override
    public void addElement(Integer x) {
        // apelez metoda addElement() din clasa parinte prin "super"
        super.addElement(x);
        super.sort();
    }

    @Override
    public void addElement(Integer x, int poz) {
        // apelez metoda definita mai sus pentru a nu strica ordinea
        // ambele metode fac acelasi lucru acum
        addElement(x);
    }
}
