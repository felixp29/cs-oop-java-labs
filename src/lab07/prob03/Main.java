package lab07.prob03;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("solutions/src/lab07/prob01/test01.txt"));
            String delimiters = " \t,.;:?!\"'()[]{}<>-\r\n";
            SListSet set = new SListSet();

            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, delimiters);
                while (st.hasMoreTokens()) {
                    set.add(st.nextToken());
                }
            }
            br.close();

            // Afisare crescatoare
            Iterator<Object> it = set.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

            System.out.println("----------------------------------------------------------");

            // Afisare descrescatoare
            SListSet desc = set.reversed();
            Iterator<Object> itDesc = desc.iterator();
            while (itDesc.hasNext()) {
                System.out.println(itDesc.next());
            }
        }
        catch (IOException e) {
            System.out.println("Eroare la deschiderea sau citirea fisierului: " + e.getMessage());
        }
    }
}
