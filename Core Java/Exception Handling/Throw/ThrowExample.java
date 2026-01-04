//package Throw;
//
//import java.util.Scanner;
//
//// creating unchecked exception
//
//// creating custom class
//class YoungerAgeException extends RuntimeException{
//	
//	// constructore created
//	YoungerAgeException(String msg){
//		super(msg); // here msg will pass to default handler
//	}
//}
//
//class ThrowExample{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your age: ");
//		
//		int age = sc.nextInt();
//		if(age<18) {
//			throw new YoungerAgeException("you are not elligible");
//		}
//		else {
//			System.out.println("You are ellgible");
//		}
//	}
//}

// using try and catch
package Throw;

import java.util.Scanner;

// creating unchecked exception

// creating custom class
class YoungerAgeException extends RuntimeException{
	
	// constructore created
	YoungerAgeException(String msg){
		super(msg); // here msg will pass to default handler
	}
}

class ThrowExample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		try {
			int age = sc.nextInt();
			if(age<18) {
				throw new YoungerAgeException("you are not elligible");
			}
			else {  
				System.out.println("You are ellgible");
			}
		}
		catch(YoungerAgeException e) {
			e.printStackTrace();
		}
		
	}
}
