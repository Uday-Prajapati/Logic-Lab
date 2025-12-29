//13) Employee with Encapsulation + Salary Rules
//Question:
//Create Employee with validation for name and salary, plus raises.
//Requirements:
//
//Fields: private String name, private double salary
//Methods:
//
//void setName(String name) — must be non-empty
//void setSalary(double s) — must be within 10000–500000
//void raise(double percent) — adds percent to salary; validate 0–100
//
//
//Constraint: On invalid input, print a message (no exceptions).
//
//Usage Example:
//Employee e = new Employee();e.setName("");          // prints 
//invalide.setSalary(9000);      // prints 
//invalide.setSalary(120000);
//e.raise(10);            // salary -> 132000
//e.raise(200);           // prints invalid

class Employee {
	
	// fields
	private String name;
	private double salary;
	
	// methods
	void setName(String name) {
		if(name.isEmpty()) {
			System.out.println("Invalid Input");
		}else {
			this.name=name;
		}
	}
	
	void setSalary(double s) {
		if(s >= 10000 && s <= 500000) {
			this.salary = s;
		}else {
			System.out.println("invalid");
		}
	}
	
	void raise(double percent) {
		if(percent >= 0 && percent <= 100) {
			salary = salary + (salary*percent / 100);
			System.out.println(salary);
		} else {
			System.out.println("Invalid percentage");
		}
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("");
		e.setSalary(9000);
		e.setSalary(120000);
		
		e.raise(10);
		e.raise(200);
	}
}
