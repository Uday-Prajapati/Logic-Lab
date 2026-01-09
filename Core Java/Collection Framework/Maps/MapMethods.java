package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapMethods {

	public static void main(String[] args) {

		// Creating Map object
		Map<Integer, String> map = new HashMap<>();

		// ⭐ put() → add key-value pair
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "C++");
		map.put(4, "Java"); // duplicate value allowed
		map.put(2, "Spring"); // duplicate key → value replaced

		System.out.println(map);

		// ⭐ get() → returns value of given key
		System.out.println(map.get(1));

		// ⭐ containsKey() → checks key present or not
		System.out.println(map.containsKey(3));

		// ⭐ containsValue() → checks value present or not
		System.out.println(map.containsValue("Java"));

		// ⭐ size() → total number of entries
		System.out.println(map.size());

		// ⭐ remove() → removes entry using key
		map.remove(4);
		System.out.println(map);

		// ⭐ isEmpty() → checks map empty or not
		System.out.println(map.isEmpty());

		// ⭐ keySet() → returns all keys (Set)
		Set<Integer> keys = map.keySet();
		System.out.println(keys);

		// ⭐ values() → returns all values (Collection)
		Collection<String> values = map.values();
		System.out.println(values);

		// ⭐ entrySet() → returns key + value (MOST IMPORTANT)
		Set<Map.Entry<Integer, String>> entries = map.entrySet();

		// ⭐ Traversing Map using entrySet (BEST WAY)
		for(Map.Entry<Integer, String> e : entries) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}

		// ⭐ clear() → removes all entries
		map.clear();
		System.out.println(map);
	}
}
