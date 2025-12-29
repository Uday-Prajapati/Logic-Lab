//7) Counter with Static Instance Count
//Question:
//Create a Counter that tracks how many instances were created.
//Requirements:
//
//Fields: private int value
//Static field: public static int instances
//Constructor: increments instances
//Methods: void increment(), void decrement(), int getValue()
//
//Usage Example:
//Counter a = new Counter();
//Counter b = new Counter();
//Counter c = new Counter();
//System.out.println(Counter.instances); // 3

public class Counter {
	
	private int value;
	public static int instances;
	
	Counter(){
		instances++;
	}
	
	void increment() {
		value++;
	}
	
	void decrement() {
		value--;
	}
	
	public int getValue() {
		return value;
	}
	public static void main(String[] args) {
		Counter a = new Counter();
		Counter b = new Counter();
		Counter c = new Counter();
		
		System.out.println(Counter.instances);
	}

}
