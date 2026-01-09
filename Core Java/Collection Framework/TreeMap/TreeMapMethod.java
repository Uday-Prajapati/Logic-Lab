package TreeMap;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class TreeMapMethod {

	public static void main(String[] args) {

		// Creating TreeMap
		// TreeMap stores key-value pairs in SORTED order of keys
		// Null key is NOT allowed
		TreeMap<Integer, String> map = new TreeMap<>();

		// ⭐ put() → adds key-value pair
		// Keys are stored in ascending order automatically
		map.put(3, "Java");
		map.put(1, "Python");
		map.put(2, "C++");
		map.put(4, "Java");   // duplicate value allowed
		map.put(2, "Spring"); // duplicate key → value replaced

		System.out.println(map); // Sorted by key

		// ⭐ get() → returns value for given key
		System.out.println(map.get(1));

		// ⭐ containsKey() → checks key exists or not
		System.out.println(map.containsKey(3));

		// ⭐ containsValue() → checks value exists or not
		System.out.println(map.containsValue("Java"));

		// ⭐ size() → returns number of entries
		System.out.println(map.size());

		// ⭐ remove() → removes entry by key
		map.remove(4);
		System.out.println(map);

		// ⭐ isEmpty() → checks map is empty or not
		System.out.println(map.isEmpty());

		// ⭐ firstKey() → returns smallest key
		System.out.println(map.firstKey());

		// ⭐ lastKey() → returns largest key
		System.out.println(map.lastKey());

		// ⭐ headMap(key) → returns keys less than given key
		System.out.println(map.headMap(3));

		// ⭐ tailMap(key) → returns keys greater than or equal to given key
		System.out.println(map.tailMap(2));

		// ⭐ subMap(fromKey, toKey) → returns range of keys
		System.out.println(map.subMap(1, 3)); // 1 ≤ key < 3

		// ⭐ keySet() → returns all keys in sorted order
		Set<Integer> keys = map.keySet();
		System.out.println(keys);

		// ⭐ values() → returns all values
		Collection<String> values = map.values();
		System.out.println(values);

		// ⭐ entrySet() → returns key-value pairs (MOST IMPORTANT)
		Set<Map.Entry<Integer, String>> entries = map.entrySet();

		// ⭐ Traversing TreeMap using entrySet (BEST WAY)
		for (Map.Entry<Integer, String> e : entries) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}

		// ⭐ clear() → removes all entries from map
		map.clear();
		System.out.println(map);
	}
}
