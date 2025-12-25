//6: Highest Marks
//
//Scenario:
//Marks of students are stored in an array. The system must find the highest mark.
//
//Task:
//Store marks in an array
//Find and display maximum mark
//
//Concepts Tested:
//Comparison logic, loops

public class MaximumMarks {
	public static void main(String[] args) {
		// maximum value
//		int [] marks = {10,20,80,40,50};
//		
//		int max = marks[0];
//		
//		for(int i = 1; i<marks.length; i++) {
//			if(marks[i] > max) {
//				max = marks[i];
//			}
//		}
//		System.out.println("Maximum element is: " + max);
		
		
		// minimum value
		int [] marks = {10,-3,25,7,0};
		
		int min = marks[0];
		
		for(int i = 1; i<marks.length; i++) {
			if(marks[i] < min) {
				min = marks[i];
			}
		}
		System.out.println("Maximum element is: " + min);
	}
}
