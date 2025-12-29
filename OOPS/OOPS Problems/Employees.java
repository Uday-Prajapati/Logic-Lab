//5️⃣ Employee Salary System
//
//Scenario:
//Calculate salary for different types of employees.
//
//Requirements:
//Base class Employee
//
//Method: calculateSalary()
//Child classes:
//FullTimeEmployee
//PartTimeEmployee
//Override salary logic
//
//OOP Concepts Used:
//Inheritance
//Method overriding
//Runtime polymorphism
//


class Employees {
	
	double salary;
	
	double calculateSalary() {
		return salary;
	}
	
	public static void main(String[] args) {
		Employees e1 = new FullTimeEmployee();
		Employees e2 = new PartTimeEmployee();
		
		System.out.println(e1.calculateSalary());
		System.out.println(e2.calculateSalary());

	}
}

class FullTimeEmployee extends Employees{
	double calculateSalary() {
		salary = 5000;
		double bonus = 0.2* salary;
		return salary + bonus;
	}
}

class PartTimeEmployee extends Employees{
	double calculateSalary() {
		int hoursWorked = 80;
		double hoursRate = 500;
		return hoursWorked * hoursRate;
	}
}
