public class StringConstructor {
    public static void main(String[] args) {

        // 1. String literal
        String s1 = "Java";

        // 2. Using new keyword
        String s2 = new String("Core Java");

        // 3. From char array
        char[] ch = {'J', 'a', 'v', 'a'};
        String s3 = new String(ch);

        // 4. From char array with range
        char[] ch2 = {'H', 'e', 'l', 'l', 'o'};
        String s4 = new String(ch2, 1, 3); // ell

        // 5. From byte array
        byte[] b = {65, 66, 67};
        String s5 = new String(b); // ABC

        // 6. From another String object
        String s6 = new String(s1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
