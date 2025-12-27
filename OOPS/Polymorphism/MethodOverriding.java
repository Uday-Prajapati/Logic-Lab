//class MethodOverriding {
//	// First Method
//	// same method but in different class
//	void show() { // no argument pass that aregument are same
//		System.out.println("1");
//	} 
//}
//
//class ABC extends MethodOverriding{
//	// Second Method
//	// same method but in different class
//	void show() { // no argument pass that aregument are same
//		System.out.println("1");
//	}


// type of argument must be same i.e in first method string a thenin second method string a
//class MethodOverriding {
//	// First Method
//	// same method but in different class
//	void show(String a) { // no argument pass that aregument are same
//		System.out.println("1");
//	}
//}
//
//class ABC extends MethodOverriding{
//	// Second Method
//	// same method but in different class
//	void show(String a) { // no argument pass that aregument are same
//		System.out.println("1");
//	}


// sequence of arfument must be same i.e String a , int a

class MethodOverriding {
	// First Method
	// same method but in different class
	void show(String a, int b) { // no argument pass that aregument are same
		System.out.println("1");
	}
}

class ABC extends MethodOverriding{
	// Second Method
	// same method but in different class
	void show(String a, int b) { // no argument pass that aregument are same
		System.out.println("1");
	}
	public static void main(String[] args) {
		// it will call the First Method
		MethodOverriding mo = new MethodOverriding();
		mo.show("Java", 101); 
		
		// It will call  Second Method
		ABC a = new ABC();
		a.show("Java", 101);
	}
}
