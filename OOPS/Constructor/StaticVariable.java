// efficient for memory management

public class StaticVariable {
	
	int empid;
	String name;
	static String company = "sp"; // static variable
	
	StaticVariable(int empid, String name){
		this.empid = empid;    
		this.name = name;
	}
	
	void display() {
		System.out.println(empid + " " + name + " " + company);
	}

	public static void main(String[] args) {
		StaticVariable obj = new StaticVariable(101,"uday");
		obj.display();
		
		StaticVariable obj1 = new StaticVariable(102,"rohit");
		obj1.display();
	}
}
