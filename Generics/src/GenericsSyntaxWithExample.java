// Sntax of ArrayList
//ArrayList<String> list = new ArrayList<>();


// this program will require typecasting 
import java.util.ArrayList;
//
//public class GenericsSyntaxWithExample {
//
//	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//        list.add("Hello");
//        list.add(123);
//        list.add(3.14);
//
//        String str = (String) list.get(0); // typecasting needed
//        String str1 = (String) list.get(1);
//	}
//}

// this will cause this exception: 
//Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//at com.engineeringdigest.corejava.Main.main(Main.java:13)


// to solve this problem we user ArrayList<String> list = new ArrayList<>(); so this program willallow only String oject tot store
import java.util.ArrayList;

public class GenericsSyntaxWithExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String s = list.get(0);
        String s1 = list.get(1);

    }
}