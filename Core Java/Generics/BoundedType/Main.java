package BoundedType;

public class Main {

	public static void main(String[] args) {
		Calculator<Integer> c1 = new Calculator<>();
        System.out.println(c1.square(5));

        Calculator<Double> c2 = new Calculator<>();
        System.out.println(c2.square(2.5));
        
//        Calculator<Integer> c1 = new Calculator<>(); - cannot pass string coz it extend number
	}
}
