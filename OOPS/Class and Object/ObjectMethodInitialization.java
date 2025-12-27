public class ObjectMethodInitialization {
	
	String color;
	int age;
	
	void initObject(String c, int a) {
		// intialize variable to argument
		color = c;
		age = a;
	}
	
	void display() {
		System.out.println(color + " : " + age);
	}

	public static void main(String[] args) {
		 ObjectMethodInitialization obj1 = new  ObjectMethodInitialization();
		 obj1.initObject("black", 12);
		 obj1.display();
	}
}
