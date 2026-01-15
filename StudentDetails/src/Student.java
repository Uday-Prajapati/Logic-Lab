public class Student {
	
	// Fill the code
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	
	// student id
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	// student name
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	// student address
	public void setStudentAddress(String studentAddress) {
		this.studentAddress=studentAddress;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	
	//student college name
	public void setCollegeName(String collegeName) {
		this.collegeName=collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	// 4 argument constuctor 
	public Student(int studentId, String studentName, String studentAddress, String collegeName){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
	
	// 3 argument constructor
	public Student(int studentId, String studentName, String studentAddress){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}
}
