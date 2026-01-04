package Wildcard;

import java.util.*;

class Test {

    static void display(List<? extends Number> list) {
    	list.add(null);   
        for (Number n : list) {
            System.out.println(n);
        }
    }
}


public class UpperBoundedWildcard {

	public static void main(String[] args) {
		List<Integer> l1 = List.of(10, 20);
		List<Double> l2 = List.of(2.5, 3.5);
		
		Test.display(l1);
		Test.display(l2);

	}
}
