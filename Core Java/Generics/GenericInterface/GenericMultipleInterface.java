package GenericInterface;

interface Pair<K, V> {
    void set(K key, V value);
    K getKey();
    V getValue();
}

