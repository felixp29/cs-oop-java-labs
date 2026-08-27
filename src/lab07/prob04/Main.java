package lab07.prob04;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        TreeMap<String, LinkedList<Integer>> treeMap = new TreeMap<>();
        String delimiters = " \t,.;:?!\"'()[]{}<>-\r\n—";
        int numarLinie = 0;
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader("solutions/src/lab07/prob04/test04.txt"));
            while ((line = br.readLine()) != null) {
                numarLinie++; // cresc numarul liniei curente (1, 2, 3...)

                StringTokenizer st = new StringTokenizer(line, delimiters);
                while (st.hasMoreTokens()) {
                    String cuvant = st.nextToken();

                    if (!treeMap.containsKey(cuvant)) {
                        LinkedList<Integer> ll = new LinkedList<>();
                        ll.add(numarLinie);
                        treeMap.put(cuvant, ll); // pun noua lista in map-ul meu (dictionarul meu)
                    }
                    else {
                        LinkedList<Integer> listaExistenta = treeMap.get(cuvant); // iau lista deja existenta
                        listaExistenta.add(numarLinie); // adaug la ea numarul de linie la care am gasit cuvantul
                    }
                }
            }
            br.close();

        }
        catch (IOException e) {
            System.out.println("Eroare la deschiderea sau citirea");
        }

        Iterator<Map.Entry<String, LinkedList<Integer>>> it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, LinkedList<Integer>> entry = it.next();
            System.out.println(entry.getKey());

            LinkedList<Integer> linii = entry.getValue();
            Iterator<Integer> it2 = linii.iterator();

            while (it2.hasNext()) {
                System.out.println(it2.next());
            }
            System.out.println("Total: " + linii.size());
        }
    }
}
