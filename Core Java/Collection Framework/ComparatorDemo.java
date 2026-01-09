import java.util.*;

// integer sorting
//class MyComparator implements Comparator<Integer> {
//    public int compare(Integer a, Integer b) {
//        return b - a;   // descending order
//    }
//}
//
//public class ComparatorDemo {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(10);
//        al.add(40);
//        al.add(20);
//
//        Collections.sort(al, new MyComparator());
//        System.out.println(al);
//    }
//}

// String sorting
//import java.util.*;
//
//class Student {
//    int age;
//    String name;
//
//    Student(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//}
//
//class AgeComparator implements Comparator<Student> {
//    public int compare(Student s1, Student s2) {
//        return s1.age - s2.age;   // ascending age
//    }
//}
//
//public class ComparatorDemo {
//    public static void main(String[] args) {
//
//        ArrayList<Student> al = new ArrayList<>();
//        al.add(new Student(22, "Rahul"));
//        al.add(new Student(20, "Aman"));
//
//        Collections.sort(al, new AgeComparator());
//
//        for(Student s : al) {
//            System.out.println(s.age + " " + s.name);
//        }
//    }
//}
//
