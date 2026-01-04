//4: Attendance Check (Search)
//Scenario:
//A teacher wants to check if a particular student roll number is present in the attendance list.
//
//Task:
//Store roll numbers in an array
//Search for a given roll number
//Print Present or Absent
//
//Concepts Tested:
//Linear search, boolean flag

public class AttendanceCheck {

	public static void main(String[] args) {
		int [] rollNo = {1,2,3,4,5};
		int element = 4;
		boolean found = false;
		
		for(int i = 0 ; i<rollNo.length; i++) {
			if(rollNo[i] == element) {
				System.out.print("Present");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.print("Absent");
		}
	}

}
