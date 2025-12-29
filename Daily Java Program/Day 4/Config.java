//5) Config (Static Constants)
//Question:
//Create a Config class of public constants and print them.
//Requirements:
//
//Public constants: public static final String APP_NAME, VERSION
//Public constant: public static final int MAX_USERS
//Constraint: All are public static final.
//
//Usage Example:
//
//System.out.println(MathUtil.max(7, 3));            // 7
//System.out.println(MathUtil.clamp(15, 0, 10));     // 10
//System.out.println(MathUtil.clamp(-3, -2, 5));     // -2
import java.util.Scanner;
public class Config {
	
	public static final String APP_NAME = "MyApplication";
	public static final String VERSION = "1.0.0";
	public static final int MAX_USERS = 100;
	
	public static void main(String[] args) {
		
		// printing constant
		System.out.println(Config.APP_NAME);            // 7
		System.out.println(Config.VERSION);    
		System.out.println(Config.MAX_USERS);  
	}
}
