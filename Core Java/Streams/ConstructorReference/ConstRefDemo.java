package ConstructorReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstRefDemo {
	
	//1. No-argument Constructor (Supplier)
//	ConstRefDemo(){
//		System.out.println("abcd");
//	}
//	
//	public static void main(String[] args) {
//		Supplier<ConstRefDemo> crf = ConstRefDemo::new;
//		crf.get();
//
//	}
	
	// 2. One-argument Constructor (Function)
//	int id;
//	ConstRefDemo(int id){
//		this.id = id;
//	}
//	
//	public static void main(String[] args) {
//		Function<Integer, ConstRefDemo> f = ConstRefDemo::new;
//		ConstRefDemo crf = f.apply(101);
//		System.out.println(crf.id);
//	}
	
	// 3. Two-argument Constructor (BiFunction)
	int id;
    String name;

    ConstRefDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static void main(String[] args) {

        BiFunction<Integer, String, ConstRefDemo> bf = ConstRefDemo::new;

        ConstRefDemo s = bf.apply(1, "Rahul");
        System.out.println(s.id + " " + s.name);
    }
}
