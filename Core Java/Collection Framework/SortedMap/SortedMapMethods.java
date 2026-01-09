package SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class SortedMapMethods {

	public static void main(String[] args) {

		// Creating SortedMap
		// SortedMap stores key-value pairs in SORTED (ascending) order of keys
		SortedMap<Integer, String> map = new TreeMap<>();

		// ⭐ put() → adds key-value pair in sorted order
		map.put(3, "Java");
		map.put(1, "Python");
		map.put(2, "C++");
		map.put(4, "Java");   // duplicate value allowed
		map.put(2, "Spring"); // duplicate key → value replaced

		System.out.println(map); // sorted by key

		// ⭐ get() → returns value for given key
		System.out.println(map.get(1));

		// ⭐ containsKey() → checks key exists or not
		System.out.println(map.containsKey(3));

		// ⭐ containsValue() → checks value exists or not
		System.out.println(map.containsValue("Java"));

		// ⭐ size() → total number of entries
		System.out.println(map.size());

		// ⭐ remove() → removes entry using key
		map.remove(4);
		System.out.println(map);

		// ⭐ isEmpty() → checks map empty or not
		System.out.println(map.isEmpty());

		// ⭐ firstKey() → returns smallest key
		System.out.println(map.firstKey());

		// ⭐ lastKey() → returns largest key
		System.out.println(map.lastKey());

		// ⭐ headMap(key) → returns keys LESS THAN given key
		System.out.println(map.headMap(3));

		// ⭐ tailMap(key) → returns keys GREATER THAN OR EQUAL to key
		System.out.println(map.tailMap(2));

		// ⭐ subMap(fromKey, toKey) → returns range (from ≤ key < to)
		System.out.println(map.subMap(1, 4));

		// ⭐ keySet() → returns all keys in sorted order
		Set<Integer> keys = map.keySet();
		System.out.println(keys);

		// ⭐ values() → returns all values
		Collection<String> values = map.values();
		System.out.println(values);

		// ⭐ entrySet() → returns key-value pairs (BEST for traversal)
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}

		// ⭐ clear() → removes all entries
		map.clear();
		System.out.println(map);
	}
}
