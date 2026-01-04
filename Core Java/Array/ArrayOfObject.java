class Student{
	int rollNo;
	String name;
}

public class ArrayOfObject {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollNo = 1;
		s1.name="uday";
		
		Student s2 = new Student();
		s2.rollNo = 2;
		s2.name="rohit";
		
		Student[] student = new Student[2];
		student[0] = s1;
		student[1] = s2;
		
		for(int i = 0; i<student.length; i++) {
			System.out.println(student[i].name + " : " + student[i].rollNo);
		}
		
		for(Student stud : student) {
			System.out.println(stud.name + ":" + stud.rollNo);
		}
	}
}
