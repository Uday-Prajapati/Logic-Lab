//5: Salary Increment
//
//Scenario: A company stores salaries of employees in an array. Each employee gets a 10% increment.
//
//Task:
//Store salaries in an array
//Increase each salary by 10%
//Display updated salaries

//Concepts Tested:
//Array update, arithmetic operations

public class SalaryIncrement {
	public static void main(String[] args) {	
		int[] salaryOfEmp = {5000,6000,7000,800};
		
		for (int i = 0; i < salaryOfEmp.length; i++) {
            salaryOfEmp[i] = salaryOfEmp[i] + (salaryOfEmp[i] * 10 / 100);
        }
		System.out.print("Updated Salary: ");
		
		for(int salary : salaryOfEmp) {
			System.out.print(salary + " ");
		}
	}
}
