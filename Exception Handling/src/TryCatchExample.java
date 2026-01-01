public class TryCatchExample {
    public static void main(String[] args) {
    	
        try {
        	System.out.println("1");
        	int a = 10, b = 0, c;
            c = a / b;   // risky code inside try
            System.out.println("2");
            System.out.println(c);
            System.out.println("3"); // this line will not print coz it is after exception line i.e c = a / b;
        } catch (Exception e) {
        	System.out.println("4");
            System.out.println("Exception handled: " + e);
            System.out.println("7");
        }

        System.out.println("Program continues...");
    }
}
