//10) IDGenerator (Static Sequencing)
//Question:
//Create an ID generator and use it to assign IDs in a User class.
//Requirements:
//
//IDGenerator:
//
//Field: private static int next = 1000
//Method: public static int nextId() — returns current, then increments
//
//
//User:
//
//Field: final int id — assigned via IDGenerator.nextId() in constructor
//Optional field: String name
//
//
//
//Usage Example:
//User u1 = new User("A");
//User u2 = new User("B");
//System.out.println(u1.getId()); // 1000
//System.out.println(u2.getId()); // 1001Show more lines

class IDGenerator {

    private static int next = 1000;

    public static int nextId() {
        return next++;
    }
}

class User {

    private final int id;
    private String name;

    User(String name) {
        this.id = IDGenerator.nextId();
        this.name = name;
    }

    public int getId() {
        return id;
    }
}

public class IDGeneratorStatic {
    public static void main(String[] args) {
        User u1 = new User("A");
        User u2 = new User("B");

        System.out.println(u1.getId()); // 1000
        System.out.println(u2.getId()); // 1001
    }
}
