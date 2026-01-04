//2: Student Record Deletion
//
//Scenario:
//A school maintains roll numbers of students in an array. One student leaves the school and their roll number needs to be removed using index position.
//
//Task:
//Create an array of roll numbers
//Delete the element at the given index
//Print the final array

//Concepts Tested:
//Array deletion, index handling

public class StudentRecordDeletion {

	public static void main(String[] args) {
		int [] rollNo = {1,2,3,4,5,6};
		int indexPos = 3;
		
		int [] newRollNo = new int[rollNo.length-1];
		int j = 0;
		
		for(int i = 0; i<rollNo.length; i++) {
			if(i == indexPos) {
				continue;
			}
			newRollNo[j] = rollNo[i];
			j++;
		}
		for(int num : newRollNo) {
			System.out.print(num + " ");
		}
	}
}
