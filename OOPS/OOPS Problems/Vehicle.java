//3️⃣ Vehicle Inheritance System 
//Scenario: Different vehicles have common behavior but different actions. 
//Requirements: Parent class Vehicle 
//Method: start() 
//Child classes: 
//Car 
//Bike 
//
//Override start() method 
//OOP Concepts Used: 
//Inheritance 
//Method 
//overriding 
//Polymorphism

class Vehicle {
	
	void start() {
		System.out.println("Vehicle class");
	}
	
public static void main(String[] args) {
		Vehicle v;
		
		v = new Cars();
		v.start();
		
		v = new Bike();
		v.start();

	}
}
class Cars extends Vehicle {
	
	void start() {
		System.out.println("Car is started");
	}
}

class Bike extends Vehicle {
	void start() {
		System.out.println("Bike is started");
	}
}
