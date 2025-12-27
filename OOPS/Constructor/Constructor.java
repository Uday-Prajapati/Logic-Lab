// Default constructor
//public class test{
//	int i;
//	public static void main(String[] args) {
//		test t1 = new test();
//		System.out.println(t1.i);
//	}
//}

// User Define Constructor
//public class example { 
//    class test {
//        public test() { 
//            System.out.println("Constructor"); 
//        }
//
//        public static void main(String[] args) { 
//            test t = new test(); 
//        }
//    }
//}

// Parameterized constructor
// Object Initialization Using  Parametrized Constructor 
public class Constructor {
	
    // Define the Employee class
    static class Employee {
        String name;
        int emp_id;

        // Constructor to initialize the object
        public Employee(String name, int emp_id) {
            this.name = name;
            this.emp_id = emp_id;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Employee class using the constructor
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);

        // Print the details to verify initialization
        System.out.println("Employee Name: " + emp1.name + emp2.name);
        System.out.println("Employee ID: " + emp1.emp_id + emp2.emp_id);
    }
}

