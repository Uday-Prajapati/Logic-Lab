public class MultipleCatchExample {
    public static void main(String[] args) {

        try {
            int a = 10, b = 0;
            System.out.println(a / b);   // ArithmeticException
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (Exception e) {
            System.out.println("General exception");
        }

        System.out.println("Program continues...");
    }
}
