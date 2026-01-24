package GenericsCollectionStream;

import java.util.*;
import java.util.stream.*;

// Generic Student class
// T extends Number allows Integer, Double marks
class Student<T extends Number> {

    private String name;     // Student name
    private T marks;         // Student marks (generic)

    // Constructor
    public Student(String name, T marks) {
        this.name = name;
        this.marks = marks;
    }

    // Converts marks to double for comparison & calculation
    public double getMarks() {
        return marks.doubleValue();
    }

    public String getName() {
        return name;
    }
}

public class StudentResultApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student<Integer>> students = new ArrayList<>();
        // List to store students

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();            // Reads number of students
        sc.nextLine();                  // Clears buffer

        // Input loop
        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();    // Reads name

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();       // Reads marks
            sc.nextLine();                  // Clears buffer

            // Adds Student object to list
            students.add(new Student<>(name, marks));
        }

        System.out.println("\nPassed Students:");

        // Filters students with marks >= 40
        students.stream()
                .filter(s -> s.getMarks() >= 40)
                .forEach(s -> System.out.println(s.getName()));

        // Finds topper using max()
        Student<Integer> topper =
                students.stream()
                        .max(Comparator.comparingDouble(Student::getMarks))
                        .orElse(null);

        if (topper != null) {
            System.out.println("\nTopper: " + topper.getName());
        }

        // Calculates average marks
        double average =
                students.stream()
                        .mapToDouble(Student::getMarks)
                        .average()
                        .orElse(0);

        System.out.println("Average Marks: " + average);
    }
}
