//Student Management System
//
//Scenario:
//Design a system to store and display student details.
//
//Requirements:
//Create a Student class
//
//Data members: id, name, marks
//Method: displayDetails()
//Create object and print student info
//
//OOP Concepts Used:
//Class & Object
//Encapsulation
//Constructor

class Student{
	private int id;
	private String name;
	private double marks;
	
	// constructor
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	// getting method
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getStudMarks() {
		return marks;
	}
	
	public void displayDetails() {
		System.out.println("Id: " + id + ", Name: " + name + ", Marks: " + marks);
	}
}

public class StudentManagementSystem {

	public static void main(String[] args) {
		Student st = new Student(101, "rohit", 50);
		st.displayDetails();
		
	}
}
