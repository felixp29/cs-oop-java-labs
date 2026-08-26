package lab07.prob01;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) { // sau aici throws IOException { pt a pasa exceptia mai departe si din main
    // in caz de throws IOException, JVM-ul va opri programul direct și va afișa stack trace-ul complet în consolă.
        Main o = new Main();
        try {
            TreeSet<String> cuvinteCrescator = o.printWords("solutions/src/lab07/prob01/test01.txt");
            /* Asa ar afisa intre paranteze drepte [A, Atunci, Capra, ...]
            System.out.println(cuvinteCrescator);
            System.out.println(o.printWordsComparator(cuvinteCrescator));

            Cerinta spune:
            În main se apelează pe rând cele două metode și se afișează cuvintele,
            câte un cuvânt pe linie: mai întâi în ordine crescătoare, apoi o linie separatoare —,
            urmată de ordinea descrescătoare.

            Pentru asta, fac parcurgerea folosind Iterator. */
            Iterator<String> itCresc = cuvinteCrescator.iterator();
            while (itCresc.hasNext()) {
                System.out.println(itCresc.next());
            }

            System.out.println("----------------------------------------------------------");

            TreeSet<String> cuvinteDescrescator = o.printWordsComparator(cuvinteCrescator);
            Iterator<String> itDescresc = cuvinteDescrescator.iterator();
            while (itDescresc.hasNext()) {
                System.out.println(itDescresc.next());
            }
        }
        catch (IOException e) {
            System.out.println("Eroare la deschiderea sau citirea fisierului: " + e.getMessage());
        }
    }

    public TreeSet<String> printWords(String fileName) throws IOException {

        TreeSet<String> cuvinte = new TreeSet<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String delimiters = " \t,.;:?!\"'()[]{}<>-\r\n";

        String linie;
        while ((linie = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linie, delimiters);
            while (st.hasMoreTokens()) {
                cuvinte.add(st.nextToken());
            }
        }
        br.close();
        return cuvinte;
    }

    public TreeSet<String> printWordsComparator(TreeSet<String> asc) {

        Comparator<String> inversAlfabetic = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };

        // Creez setul nou desc cu constructor cu parametrul comparatorul definit anterior, fara a reciti fisierul
        TreeSet<String> desc = new TreeSet<>(inversAlfabetic);

        // Adaug toate elementele din primul set in cel nou cu addAll() nu cu clone()!
        // cu clone() noul obiect va copia și comparatorul original (adică ordinea crescătoare), suprascriind complet setul desc pe care abia l-am creat
        desc.addAll(asc);

        return desc;
    }
}
