package NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class NavigableMapMethod {

	public static void main(String[] args) {

		// Creating NavigableMap
		// NavigableMap stores key-value pairs in SORTED order
		// and provides navigation (nearest key) methods
		NavigableMap<Integer, String> map = new TreeMap<>();

		// ⭐ put() → adds key-value pair (sorted by key)
		map.put(10, "Java");
		map.put(20, "Python");
		map.put(30, "C++");
		map.put(40, "Java");   // duplicate value allowed
		map.put(20, "Spring"); // duplicate key → value replaced

		System.out.println(map);

		// ⭐ get() → returns value for given key
		System.out.println(map.get(10));

		// ⭐ containsKey() → checks key exists or not
		System.out.println(map.containsKey(30));

		// ⭐ containsValue() → checks value exists or not
		System.out.println(map.containsValue("Java"));

		// ⭐ size() → total number of entries
		System.out.println(map.size());

		// ⭐ remove() → removes entry using key
		map.remove(40);
		System.out.println(map);

		// ⭐ isEmpty() → checks map empty or not
		System.out.println(map.isEmpty());

		// ==============================
		// ⭐ NavigableMap Special Methods
		// ==============================

		// lowerKey() → returns key just smaller than given key
		System.out.println(map.lowerKey(30));

		// floorKey() → returns key ≤ given key
		System.out.println(map.floorKey(30));

		// ceilingKey() → returns key ≥ given key
		System.out.println(map.ceilingKey(25));

		// higherKey() → returns key just greater than given key
		System.out.println(map.higherKey(20));

		// pollFirstEntry() → removes & returns first entry
		System.out.println(map.pollFirstEntry());

		// pollLastEntry() → removes & returns last entry
		System.out.println(map.pollLastEntry());

		System.out.println(map);

		// descendingMap() → returns reverse order map
		NavigableMap<Integer, String> descMap = map.descendingMap();
		System.out.println(descMap);

		// descendingKeySet() → returns keys in reverse order
		Set<Integer> keys = map.descendingKeySet();
		System.out.println(keys);

		// ⭐ entrySet() → best way to traverse NavigableMap
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}

		// ⭐ clear() → removes all entries
		map.clear();
		System.out.println(map);
	}
}
