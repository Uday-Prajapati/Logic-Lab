package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class LinkedHashMapMethods {

	public static void main(String[] args) {

		// Creating LinkedHashMap
		// LinkedHashMap stores data in key-value pairs
		// and MAINTAINS INSERTION ORDER
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

		// ⭐ put() → adds key-value pair into map
		// If key already exists, old value is replaced
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "C++");
		map.put(4, "Java");       // duplicate value allowed
		map.put(null, "Spring");  // one null key allowed
		map.put(2, "SQL");        // duplicate key → value replaced

		System.out.println(map);  // insertion order maintained

		// ⭐ get() → returns value associated with given key
		System.out.println(map.get(1));

		// ⭐ containsKey() → checks whether key exists or not
		System.out.println(map.containsKey(3));

		// ⭐ containsValue() → checks whether value exists or not
		System.out.println(map.containsValue("Java"));

		// ⭐ size() → returns total number of entries
		System.out.println(map.size());

		// ⭐ remove() → removes entry using key
		map.remove(4);
		System.out.println(map);

		// ⭐ isEmpty() → checks whether map is empty or not
		System.out.println(map.isEmpty());

		// ⭐ keySet() → returns all keys in Set form
		Set<Integer> keys = map.keySet();
		System.out.println(keys);

		// ⭐ values() → returns all values in Collection form
		Collection<String> values = map.values();
		System.out.println(values);

		// ⭐ entrySet() → returns all key-value pairs (MOST IMPORTANT)
		Set<Map.Entry<Integer, String>> entries = map.entrySet();

		// ⭐ Traversing LinkedHashMap using entrySet (BEST WAY)
		for (Map.Entry<Integer, String> e : entries) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}

		// ⭐ clear() → removes all entries from map
		map.clear();
		System.out.println(map);
	}
}
