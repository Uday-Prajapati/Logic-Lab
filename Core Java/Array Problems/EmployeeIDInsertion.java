//1: Employee ID Insertion
//
//Scenario:
//An HR system stores employee IDs in an array. A new employee joins and their ID must be inserted at a specific position.
//
//Task:
//Initialize an array of employee IDs
//Insert a new ID at the given index
//Display the updated array
//
//Concepts Tested:
//Array creation, insertion logic, loops

public class EmployeeIDInsertion {
	public static void main(String[] args) {
		int [] oldEmployeeId = {1,2,3,4,5};
		int indexPos = 5;
		int newEmployeeId = 6;
		
//		if(indexPos < 0 || indexPos > oldEmployeeId.length) {
//			System.out.print("Invalid Syntax");
//			return;
//		}
		
		int [] newEmployee = new int[oldEmployeeId.length+1];
		
		for(int i = 0; i<oldEmployeeId.length; i++) {
			newEmployee[i] = oldEmployeeId[i];
		}
		
		newEmployee[indexPos] = newEmployeeId;
		
		for(int i = indexPos; i<oldEmployeeId.length; i++) {
			newEmployee[i+1] = oldEmployeeId[i];
		}
		
		for(int num : newEmployee) {
			System.out.print(num + " ");
		}
	}
}
