import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	
	private static Map <String,Double> employeeMap = new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		// add employee detail to map
		employeeMap.put(employeeName, salary);
		
	}
	
	public static EmployeeAudit findEmployee()
	{
		ArrayList<String> name=null;
		// Fill the code
		// identify the employees whose salary is less than or equal to the salary passed as an argument.
		return (salaryLimit) -> {
			ArrayList<String> employeeList = new ArrayList<>();
			for(Map.Entry<String, Double> entry : employeeMap.entrySet()) {
//				 salary is less than or equal
				if(entry.getValue() <= salaryLimit) {
					employeeList.add(entry.getKey());
				}
			}
			return employeeList;
		};
	}
	
	public static void main(String[] args)
	{
		// Fill the code

		Scanner sc=new Scanner(System.in);
		UserInterface ui = new UserInterface();
		
		int choice;
		while(true) {
			System.out.println("1.Add Employee Details");
			System.out.println("2.Find Employee Details");
			System.out.println("3.Exit");
			
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter the Employee name");
				String employeeName = sc.nextLine();
				
				System.out.println("Enter the Employee Salary");
				double salary = sc.nextInt();
			
				ui.addEmployeeDetails(employeeName, salary);
				
			}
			else if(choice == 2) {
				System.out.println("Enter the salary to be searched");
				double salarySearch = sc.nextInt();
				
				// method call form employee audi to find the employee
				EmployeeAudit audit = findEmployee();
				ArrayList<String> res = audit.fetchEmployeeDetails(salarySearch);
				
				if(res.isEmpty()) {
					System.out.println("No Employee Found");
				}else {
					System.out.println("Employee List");
					for(String emp : res) {
						System.out.println(emp);
					}
				}
			}
			else if(choice == 3){
				System.out.println("Let's complete the session");
				break;
			}
		}
	}

}
