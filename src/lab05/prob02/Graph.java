package lab05.prob02;

import java.util.Vector;

public class Graph extends MyList {

    int noduri;
    Vector<Integer> vizitat;

    public Graph(int noduri) {
        super();
        this.noduri = noduri;
        this.vizitat = new Vector<>();

        // populez lista mare cu liste goale pentru fiecare nod
        // (de la 0 la noduri)
        for (int i = 0; i <= noduri; i++) {
            // Fiecare nod are propria sa listă de vecini
            super.add(new MyList());
            // Marcăm inițial fiecare nod ca fiind nevizitat (0)
            this.vizitat.add(0);
        }
    }

    // adauga arcul (x, y) in graf
    public void add(int x, int y) {
        MyList veciniX = (MyList) this.get(x);
        // Il adaug pe y in lista lui de vecini
        veciniX.add(y);
    }

    // parcurge in adancime graful, pornind din nodul start
    // si afisand fiecare nod vizitat
    public void dfs(int start) {
        // 1. iau lista vecinilor nodului curent
        MyList listaVecini = (MyList) this.get(start);

        // 2. afisez nodul curent
        System.out.print(start + " ");

        // 3. marchez nodul curent ca vizitat
        vizitat.set(start, 1);

        // 4. parcurg fiecare vecin al lui 'start'
        if (listaVecini != null) {
            for (int i = 0; i < listaVecini.size(); i++) {
                int vecin = (int) listaVecini.get(i);

                // daca vecinul NU a fost inca vizitat, merg recursiv in el
                if (vizitat.get(vecin) == 0) {
                    dfs(vecin);
                }
            }
        }
    }

    @Override
    public String toString() {
        String rezultat = "";
        for (int i = 1; i<= noduri; i++) {
            rezultat = rezultat + i + ": " + this.get(i) + "\n";
        }
        return rezultat;
    }
}
