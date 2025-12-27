class Employee{
	// data hiding using private variable
	private int empid;
	
	// using setter method
	public void setEmpId(int eid) {
		empid = eid;
	}
	
	// using getter method
	public int getEmpId(){
		return empid;
	}
}

public class Company {

	public static void main(String[] args) {
		Employee em = new Employee();
		// setting the data 
		em.setEmpId(101);
		
		// accessing the data
		System.out.println(em.getEmpId());

	}

}
