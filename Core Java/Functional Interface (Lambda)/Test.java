public class Test {
    public static void main(String[] args) {
    	MyInterface my = (a, b) -> a + b; // converted in lambda
        System.out.println(my.add(10, 20));
    }
}
