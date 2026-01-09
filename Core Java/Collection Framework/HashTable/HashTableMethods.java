package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableMethods {
    public static void main(String[] args) {
        // Creating a Hashtable of Integer keys and String values
        Hashtable<Integer, String> ht = new Hashtable<>();

        // 1. put() -> Adds key-value pairs
        ht.put(1, "Apple");
        ht.put(2, "Banana");
        ht.put(3, "Cherry");
        ht.put(4, "Date");
        System.out.println("Hashtable after put(): " + ht);

        // 2. get() -> Returns value for a given key
        String value = ht.get(2);
        System.out.println("Value at key 2: " + value);

        // 3. remove() -> Removes key-value pair
        ht.remove(3);
        System.out.println("Hashtable after removing key 3: " + ht);

        // 4. containsKey() -> Checks if key exists
        boolean hasKey = ht.containsKey(1);
        System.out.println("Does key 1 exist? " + hasKey);

        // 5. containsValue() -> Checks if value exists
        boolean hasValue = ht.containsValue("Date");
        System.out.println("Does value 'Date' exist? " + hasValue);

        // 6. size() -> Returns number of key-value pairs
        System.out.println("Size of Hashtable: " + ht.size());

        // 7. isEmpty() -> Checks if Hashtable is empty
        System.out.println("Is Hashtable empty? " + ht.isEmpty());

        // 8. keys() -> Returns enumeration of keys
        System.out.print("Keys in Hashtable: ");
        Enumeration<Integer> keys = ht.keys();
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        // 9. elements() -> Returns enumeration of values
        System.out.print("Values in Hashtable: ");
        Enumeration<String> elements = ht.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
        }
        System.out.println();

        // 10. clear() -> Removes all key-value pairs
        ht.clear();
        System.out.println("Hashtable after clear(): " + ht);
    }
}
