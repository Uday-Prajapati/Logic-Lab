package GenericClass;

public class Main {
    public static void main(String[] args) {

        Box<String> b1 = new Box<>();
        b1.setItem("Java");
        System.out.println(b1.getItem());

        Box<Integer> b2 = new Box<>();
        b2.setItem(100);
        System.out.println(b2.getItem());
    }
}
