package lab07.prob03;

import java.util.*;

public class SListSet extends LinkedList<Object> implements SortedSet<Object> {

    private Comparator<Object> cmp;

    public SListSet() {
        this.cmp = null;
    }

    public SListSet(Comparator<Object> cmp) {
        this.cmp = cmp;
    }

    private int compareObjects(Object a, Object b) {
        if (a == null || b == null) {
            throw new NullPointerException("Nu se accepta elemente null");
        }
        if (this.cmp != null) {
            return this.cmp.compare(a, b);
        } else {
            return ((Comparable) a).compareTo(b);
        }
    }

    @Override
    public Comparator<Object> comparator() { //comparator folosit (null pentru comparatia naturală)
        return this.cmp;
    }

    @Override // din clasa LinkedList, restul metodelor sunt din interfata SortedSet
    public boolean add(Object o) { //adaugă un elemnt în mulțime dacă nu există deja și sortează mulțimea
        if (o == null) {
            throw new NullPointerException("Nu se accepta null");
        }

        for (int i = 0; i < this.size(); i++) {
            Object curent = this.get(i);
            int rez = compareObjects(o, curent);

            if (rez == 0) {
                return false; // exista deja, duplicat
            }

            if (rez < 0) {
                super.add(i, o); // 'o' este mai mic decat elementul curent, il inserez inainte
                return true;
            }
        }
        return super.add(o);
    }

    @Override
    public Object first() { //primul obiect din mulțime
        return this.getFirst();
    }

    @Override
    public Object last() { // ultimul obiect din mulțime
        return this.getLast();
    }

    @Override
    public SortedSet subSet(Object from, Object to) { // copie ordonată a intervalului [from, to)
        SListSet subset = new SListSet(this.cmp);
        Iterator<Object> it = this.iterator();
        while (it.hasNext()) {
            Object elem = it.next();
            if (compareObjects(elem, from) >= 0 && compareObjects(elem, to) < 0) {
                subset.add(elem);
            }
        }
        return subset;
    }

    @Override
    public SortedSet headSet(Object to) { // copie ordonată a intervalului (primul_element, to)
        SListSet subset = new SListSet(this.cmp);
        Iterator<Object> it = this.iterator();
        while (it.hasNext()) {
            Object elem = it.next();
            if (compareObjects(elem, to) < 0) {
                subset.add(elem);
            }
        }
        return subset;
    }

    @Override
    public SortedSet tailSet(Object from) { // copie ordonată a intervalului [from, ultimul_element)
        SListSet subset = new SListSet(this.cmp);
        Iterator<Object> it = this.iterator();
        while (it.hasNext()) {
            Object elem = it.next();
            if (compareObjects(elem, from) >= 0) {
                subset.add(elem);
            }
        }
        return subset;
    }

    public SListSet reversed() { // întoarce o copie a mulțimii ordonată descrescător, construită pe baza comparatorului curent (dacă există) sau a ordinii naturale; populați exclusiv din elementele setului curent, fără recitirea fișierului și fără sortări/inversări externe.
        Comparator<Object> invers = new Comparator<Object>() {
            @Override
            public int compare(Object a, Object b) {
                return -compareObjects(a, b); // inverseaza ordinea
            }
        };

        SListSet res = new SListSet(invers);
        Iterator<Object> it = this.iterator();
        while (it.hasNext()) {
            res.add(it.next());
        }
        return res;
    }
}