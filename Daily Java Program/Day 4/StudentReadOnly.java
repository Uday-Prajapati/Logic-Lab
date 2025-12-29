import java.util.Scanner;

public class StudentReadOnly {

	final int id;  // immutable
	private String name; //mutable
	
	// comstructor
	StudentReadOnly(int id){
		this.id = id;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// getter
	public int getId() {
		return id;
	}
	
	// getter
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
//		StudentReadOnly s = new StudentReadOnly(101);
//		s.setName("Uday");
//		System.out.println(s.getId());
//		s.id = 202;
// 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		StudentReadOnly s = new StudentReadOnly(101);
		
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		s.setName(name);
		
		System.out.println("Student ID: " + s.getId());
		System.out.println("Student Name: " + s.getName());
	}
}
