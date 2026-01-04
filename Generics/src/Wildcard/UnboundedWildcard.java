package Wildcard;
import java.util.*;
class Demo {
	static void show(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}

public class UnboundedWildcard{
	public static void main(String [] args) {
		List<Integer> l1 = List.of(1,2,3);
		List<String> l2 = List.of("A", "B");
	}
}
