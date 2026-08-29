package lab08.prob01;

import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {

    // nested class
    public class ArrayMapEntry implements Map.Entry<K, V> {

        private K key;
        private V value;

        // constructor
        public ArrayMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public String toString() {
            return this.key + " - " + this.value;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }

            if (o == null || !(o instanceof Map.Entry<?, ?>)) {
                return false;
            }

            Map.Entry<?, ?> other = (Map.Entry<?, ?>) o;
            return (Objects.equals(this.key, other.getKey())) && (Objects.equals(this.value, other.getValue()));
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.key, this.value);
        }

    }

    private ArrayList<ArrayMapEntry> list = new ArrayList<>();

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new LinkedHashSet<>(this.list); // sau HashSet
        return set;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public V put(K key, V value) {
        for (int i = 0; i < list.size(); i++) {
            ArrayMapEntry entry = list.get(i);
            // V oldValue = entry.getValue(); METODA setValue() RETURNEAZA DEJA OLD VALUE!!
            if (Objects.equals(entry.getKey(), key)) {
                return entry.setValue(value);
            }
        }
        list.add(new ArrayMapEntry(key, value));
        return null;
    }
}
