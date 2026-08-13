package lab04.prob03;

import java.util.Hashtable;

public class HSet extends Hashtable {

    public HSet() {
        super();
    }

    // Adauga un element in multime, daca nu exista deja
    public boolean add(Object value) {
        if (!super.containsKey(value)) {
            // Cheia si valoarea vor fi egale (cheile sunt elementele multimii)
            super.put(value, value);
            return true;
        }
        return false;
    }

    @Override
    // Returneaza un String cu elementele multimii (doar cheile, nu perechi)
    public String toString() {
        return this.keySet().toString();
    }
}
