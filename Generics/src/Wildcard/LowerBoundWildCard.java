package Wildcard;

import java.util.*;

class Lower{
	static void addValue(List<? super Integer> list) {
		list.add(10);
		list.add(20);
	}
}
public class LowerBoundWildCard {

	public static void main(String[] args) {
		List<Number> l1 = new ArrayList<>();
		List<Number> l2 = new ArrayList<>();
		
		Lower.addValue(l1);
		Lower.addValue(l2);
		
		System.out.println(l1); // add 10 20
		System.out.println(l2); // add 10 20

	}
	
}
