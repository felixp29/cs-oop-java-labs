package lab07.prob02;

import java.util.*;

public class LinkedSet extends LinkedList<Object> implements Set<Object> {

    public LinkedSet() {
        super();
    }

    @Override
    public boolean add(Object obj) {
        if (this.contains(obj)) {
            return false;
        } else {
            return super.add(obj);
        }
    }

    @Override
    public void add(int index, Object obj) {
        if (!this.contains(obj)) {
            super.add(index, obj);
        }
    }

    @Override
    public Object set(int index, Object obj) {
        int existingIndex = this.indexOf(obj);

        // Arunc exceptia doar daca obiectul exista SI se afla la o pozitie
        // DIFERITA de 'index'
        if (existingIndex != -1 && existingIndex != index) {
            throw new IllegalArgumentException("Element duplicat la un alt index");
        }

        return super.set(index, obj);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Set)) {
            return false;
        }

        Set<?> other = (Set<?>) o;
        // Doua seturi sunt egale daca au aceeasi dimensiune si contin aceleasi elemente
        if (this.size() != other.size()) {
            return false;
        }
        return this.containsAll(other);
    }

    @Override
    public int hashCode() {
        // Contractul Set: hashCode-ul este suma hashcode-urilor elementelor continute
        int h = 0;
        Iterator<Object> it = this.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (obj != null) {
                h = h + obj.hashCode(); //hashCode()-ul elementului curent
            }
        }
        return h;
    }
}
