public class ObectReferenceInitialization {
	// instance variable
	int eye;
	String name;
	
	static void eat() {
		System.out.println("Eating");
	}

	public static void main(String[] args) {
		ObectReferenceInitialization obj = new ObectReferenceInitialization();
		obj.eat();
		// initializing obj using reference variable
		obj.eye = 2;
		obj.name ="doggy";
		System.out.println(obj.name + " has " + obj.eye + " eyes. ");
	}
}
