package lab07.prob06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

// O clasă fără generics:
public class LruCache extends LinkedHashMap {

    // Capacity se memorează în obiect și este strict pozitiv.
    private int capacity;

    // seteaza access-order = true
    public LruCache(int capacity) {
        super(capacity, 0.75f, true);
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacitatea trebuie sa fie strict pozitiva");
        }
        this.capacity = capacity;
    }

    // eliminare cand size() > capacity
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }

    // Cheile null sunt interzise (verificate în put).
    @Override
    public Object put(Object key, Object value) {
        if (key == null) {
            throw new IllegalArgumentException("Cheile null sunt interzise");
        }
        return super.put(key, value);
    }

    // O metodă statică ce execută operațiile citite din fișier și returnează cache-ul:
    // Citește fișierul, interpretează liniile în ordine, pentru GET afișează imediat rezultatul (valoare sau NULL).
    // Ignoră liniile invalide (nu oprește programul).
    public static LruCache runOps(String opsFile, int capacity) throws IOException {

        LruCache cache = new LruCache(capacity);
        BufferedReader br = new BufferedReader(new FileReader(opsFile));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            // Ignor liniile goale sau de comentariu
            if (line.isEmpty() || line.startsWith("#")) {
                continue;
            }

            String[] parts = line.split("\\s+");
            String command = parts[0];

            if (command.equalsIgnoreCase("PUT") && parts.length >= 3) {
                String key = parts[1];
                String value = parts[2];
                cache.put(key, value);
            }
            else if (command.equalsIgnoreCase("GET") && parts.length >= 2) {
                String key = parts[1];
                Object val = cache.get(key);
                if (val != null) {
                    System.out.println(val);
                } else {
                    System.out.println("NULL");
                }
            }
        }
        br.close();
        return cache;
    }

    // O metodă statică pentru afișarea stării curente a cache-ului în ordinea LRU:
    // Parcurge intrările cache.entrySet() și tipărește <cheie>=<valoare> pe linie.
    public static void printCache(LruCache cache) {
        Iterator it = cache.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
