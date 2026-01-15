public class DonorDetails 
{
	private int age;
	private long phoneNumber;
	private String name;
	private String gender;
	private String bloodGroup;
	
	
	//Include Getters and Setters
	// name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// age
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	//Gender
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	//blood group
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	public String getBloodGroup() {
		return bloodGroup;
	}
	
	// phoneNumber
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	//Include five argument constructor	
	
	public DonorDetails(String name, int age, String gender, String bloodGroup,  long phoneNumber ){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.phoneNumber = phoneNumber;
	}
}