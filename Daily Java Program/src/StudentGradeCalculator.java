//2. Student Grade Calculator
//
//Topic: Control Flow
//Task: Read marks of 5 subjects, calculate percentage, and assign grade:
//
//A: ≥90
//B: ≥75
//C: ≥60
//D: ≥40
//F: <40
//Example Input: 80 90 85 70 75
//Expected Output:
//Percentage = 80.0
//Grade = B

import java.util.Scanner;
public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int totalMarks =500;
		
		// take 5 subject marks
		System.out.print("Enter Marks of 5 subject: ");
		for(int i = 1; i<=5; i++) {
			int marks = sc.nextInt();
			
			// sum of 5 marks
			sum += marks;
		}
		
		// calculate percentage
		double percentage = (sum * 100) / totalMarks;
		System.out.println("Percentage = " + percentage);
		
		if(percentage >= 90) {
			System.out.println("Grade = A");
		}else if(percentage >= 75) {
			System.out.println("Grade = B");
		}else if(percentage >= 60) {
			System.out.println("Grade = C");
		}else if(percentage >= 40) {
			System.out.println("Grade = D");
		}else {
			System.out.println("Grade = Fail");
		}
	}
}
