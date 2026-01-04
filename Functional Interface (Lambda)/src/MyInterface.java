// abstract method this is functional interface

// Syntax:

//@FunctionalInterface
//public interface MyInterface {
//	// one abstract methid
//	public void sayHello();
//	
//	// multiple default methid
//	default void sayBye() {
//		
//	}
//	
//	default void say() {		
//	} 
//	
////	multiple static method
//	public static void sayOk() {
//		
//	}
//	
//	public static void sayOkay() {
//		
//	}
//}

@FunctionalInterface
public interface MyInterface{
	int add(int a , int b); // turn in this lambda
}
