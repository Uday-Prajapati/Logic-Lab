package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapMethods {

	public static void main(String[] args) {

		// Creating HashMap
		HashMap<Integer, String> map = new HashMap<>();

		// ⭐ put() → add key-value pair
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "C++");
		map.put(4, "Java");      // duplicate value allowed
		map.put(null, "Spring"); // one null key allowed
		map.put(2, "SQL");       // duplicate key → value replaced

		System.out.println(map);

		// ⭐ get() → returns value using key
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

		// ⭐ entrySet() → returns key-value pairs (MOST IMPORTANT)
		Set<Map.Entry<Integer, String>> entries = map.entrySet();

		// ==============================
		// ⭐ Traversing HashMap
		// ==============================

		// 1️⃣ BEST WAY → for-each with entrySet()
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}

		// 2️⃣ Normal traversal → keySet() + get()
		for (Integer key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}

		// 3️⃣ Only values traversal
		for (String v : map.values()) {
			System.out.println(v);
		}

		// ⭐ clear()
		map.clear();
		System.out.println(map);
				
	}
}
