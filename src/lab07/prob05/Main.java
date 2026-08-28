package lab07.prob05;

import java.util.*;
import java.io.*;

public class Main {

    static HashMap<String, Integer> hashMap = new HashMap<>();
    static TreeMap<String, Integer> treeMap;

    // use this CLI argument: solutions/src/lab07/director
    public static void main(String[] args) {

        String path = args.length > 0 ? args[0] : ".";
        File dir = new File(path);
        scanDirectory(dir);

        // Verificare: afisare fisiere in ordinea colectata in HashMap
        System.out.println("--- Fisiere in HashMap (nesortat) ---");
        printDisorderedMap();

        // Afisare in ordine alfabetica (prin varsarea lui HashMap intr-un TreeMap)
        System.out.println("\n--- Fisiere ordonate alfabetic (TreeMap) ---");
        printAlphabeticallyOrderedMap();

        // Afisare in ordine descrescatoare dupa dimensiune
        System.out.println("\n--- Fisiere ordonate descrescator dupa dimensiune ---");
        printSizeDescendingOrder();
    }

    static public void scanDirectory(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                File f = files[i];
                if (f.isFile()) {
                    String name = f.getName();
                    long bytes = f.length();
                    int kib = (int) ((bytes + 1023) / 1024);
                    hashMap.put(name, kib);
                }
            }
        }
    }

    static public void printDisorderedMap() {
        Iterator<Map.Entry<String, Integer>> itHash = hashMap.entrySet().iterator();
        while (itHash.hasNext()) {
            Map.Entry<String, Integer> entry = itHash.next();
            System.out.println(entry.getKey() + " - " + entry.getValue() + " KiB");
        }
    }

    static public void printAlphabeticallyOrderedMap() {
        treeMap = new TreeMap<>(hashMap);
        Iterator<Map.Entry<String, Integer>> itTree = treeMap.entrySet().iterator();
        while (itTree.hasNext()) {
            Map.Entry<String, Integer> entry = itTree.next();
            System.out.println(entry.getKey() + " - " + entry.getValue() + " KiB");
        }
    }

    static public void printSizeDescendingOrder() {
        Set<Map.Entry<String, Integer>> inputSet = hashMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(inputSet);

        Comparator<Map.Entry<String, Integer>> comparatorSize = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                // Descrescator, dupa dimensiune
                return Integer.compare(e2.getValue(), e1.getValue());
            }
        };
        Collections.sort(list, comparatorSize);

        Iterator<Map.Entry<String, Integer>> itList = list.iterator();
        while (itList.hasNext()) {
            Map.Entry<String, Integer> entry = itList.next();
            System.out.println(entry.getKey() + " - " + entry.getValue() + " KiB");
        }
    }
}
