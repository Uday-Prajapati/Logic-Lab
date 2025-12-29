//14) AccountNumber (Final Immutability + Static Checksum)
//Question:
//Implement an AccountNumber with a 12-digit invariant and static validation.
//Requirements:
//
//Field: private final String digits — must be exactly 12 digits
//Static method: public static boolean isValid(String s) — checks length & all digits
//Constructor: if s is valid, set digits; else set default "000000000000" and print "Invalid account number"
//
//Usage Example:
//AccountNumber a = new AccountNumber("123456789012"); // valid
//AccountNumber b = new AccountNumber("ABC");          // prints invalid, uses default

public class AccountNumber {
	// final field
	private final String digits;
	
	// constructor
	public AccountNumber(String s) {
		if(isValid(s)) {
			digits = s; // set digit
		}else {
			System.out.println("Invalid account number");
			digits = "000000000000";
		}
	}
	
	// static validation method
	public static boolean isValid(String s) {
		if(s.length() != 12) {
			return false;
		}
		for(int i =0; i<s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	// getter
	public String getDigits() {
		return digits;
	}
	
	public static void main(String[] args) {
		AccountNumber a = new AccountNumber("123456789012"); // valid
        System.out.println(a.getDigits());

        AccountNumber b = new AccountNumber("ABC"); // invalid
        System.out.println(b.getDigits());
	}
}
