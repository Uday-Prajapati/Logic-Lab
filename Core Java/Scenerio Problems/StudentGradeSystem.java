//Q2. Student Grade System
//Scenario: A college assigns grades based on marks.
//
//Rules:
//Marks ≥ 90 → Grade A
//Marks ≥ 75 → Grade B
//Marks ≥ 60 → Grade C
//Below 60 → Fail
//
//Task:
//Take marks as input and print grade.
//
//Concepts Tested:
//if-else ladder, data types, input handling

import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int totalMarks = 500;
        
        System.out.print("Enter marks of 5 subject: ");
        for(int i = 1; i<=5; i++) {
        	int marks = sc.nextInt();
        	sum += marks;
        }
        
        int percentage = (sum * 100) / totalMarks;
        
        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 75) {
            System.out.println("Grade B");
        } else if (percentage >= 60) {
            System.out.println("Grade C");
        } else if(percentage >= 40) {
            System.out.println("Grade D");
        }else {
        	System.out.println("Fail");
        }
    }
}

