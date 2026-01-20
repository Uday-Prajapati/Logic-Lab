public class CustomerDetails {
	// Fill the code
	private String customerName;
	private long phoneNumber;
	private String address;
	
	//getter and setter
	
	// customer name
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	// phone number
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// constructor
	public CustomerDetails(String customerName, long phoneNumber, String address) {
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
}
