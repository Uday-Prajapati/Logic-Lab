abstract class AbstractionClass {
	abstract void start();
	
	public static void main(String[] args) {
		// car class
		Car c = new Car();
		c.start();
		
		// scooter class
		Scooter s = new Scooter();
		s.start();
		
	}
}

class Car extends  AbstractionClass{
	void start() {
		System.out.println("Start with key");
	}
}

class Scooter extends  AbstractionClass{
	void start() {
		System.out.println("Start with kick");
	}
}
