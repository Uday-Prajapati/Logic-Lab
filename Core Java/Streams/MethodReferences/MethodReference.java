package MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReference {
	//Reference to a Static Method
//	public static int square(int x) {
//        return x * x;
//    }
	
	// refernece to non-static method
	public void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
//		//Reference to a Static Method
//		Function<Integer, Integer> f = MethodReference::square;
//		
//		// Lambda version: x -> StaticMethodRef.square(x)
//        System.out.println(f.apply(5)); // 25
		
		MethodReference mr = new MethodReference();
		List<String> Student = Arrays.asList("Alice","Bob");
		Student.forEach(mr::print);
	}
}
