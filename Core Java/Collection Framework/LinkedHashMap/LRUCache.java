package LinkedHashMap;
//import LinkedHashMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

	public static void main(String[] args) {

		int capacity = 3;

		// LinkedHashMap with accessOrder = true
		Map<Integer, String> lruCache = new LinkedHashMap<Integer, String>(capacity, 0.75f, true) {

			// ⭐ LRU logic
			protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
				return size() > capacity;
			}
		};

		lruCache.put(1, "A");
		lruCache.put(2, "B");
		lruCache.put(3, "C");

		System.out.println(lruCache); // {1=A, 2=B, 3=C}

		// Access key 1 (recently used)
		lruCache.get(1);

		// Add new entry → least recently used removed
		lruCache.put(4, "D");

		System.out.println(lruCache); // {3=C, 1=A, 4=D}
	}
}
