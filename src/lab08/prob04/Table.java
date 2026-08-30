package lab08.prob04;

import java.util.*;

public class Table {

    // matricea interna a clasei
    Vector<Vector<Object>> matrice;

    public Table(Object[][] rows) {
        matrice = new Vector<>();

        // parcurg matricea rand cu rand si transfer elementele din
        // Object[][] in Vector<Vector<Object>>
        for (int i = 0; i < rows.length; i++) {
            Vector<Object> newRow = new Vector<>();
            for (int j = 0; j < rows[i].length; j++) {
                newRow.add(rows[i][j]);
            }
            matrice.add(newRow);
        }
    }

    // nested interface: Printer
    public interface Printer {
        void print();
    }

     class AsciiPrinter implements Printer {

        private int[] latimi;

        public AsciiPrinter(int[] latimi) {
            this.latimi = latimi;
        }

        @Override
        public void print() {
            System.out.println("Format ASCII");
            for (int i = 0; i < matrice.size(); i++) {

                Vector<Object> row = matrice.get(i);

                for (int j = 0; j < row.size(); j++) {
                    String format = "%-" + latimi[j] + "s| ";
                    System.out.format(format, row.get(j));
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    class CsvPrinter implements Printer {

        @Override
        public void print() {
            System.out.println("Format csv");

            for (int i = 0; i < matrice.size(); i++) {
                Vector<Object> row = matrice.get(i);
                for (int j = 0; j < row.size(); j++) {
                    System.out.print(row.get(j));

                    if (j < row.size() - 1) {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    /* Polimorfism prin interfețe (sau Strategy Pattern):
     * pun interfata Printer p ca parametru = transmit de fapt orice obiect
       al unei clase care implementeaza acea interfata
     * Printer acționează ca un contract care promite că orice obiect primit
     garantează existența metodei void print().
     * Metoda Table.print nu știe și nu o interesează cum se face afișarea
     (dacă e tabel ASCII, CSV, JSON sau HTML). Ea doar execută acțiunea p.print().
     */
    public void print(Printer p) {
        p.print();
    }
}
