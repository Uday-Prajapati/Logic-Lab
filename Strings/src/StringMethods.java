public class StringMethods {
    public static void main(String[] args) {

        String s1 = "  Core Java Programming  ";
        String s2 = "core java programming";

        /* 1️⃣ Length / Accessing Characters */

        // length() → get total number of characters
        System.out.println("length(): " + s1.length());

        // charAt() → get character at given index
        System.out.println("charAt(3): " + s1.charAt(3));


        /* 2️⃣ Comparing Strings */

        // equals() → compare content (case-sensitive)
        System.out.println("equals(): " + s1.equals(s2));

        // equalsIgnoreCase() → compare content ignoring case
        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));

        // compareTo() → lexicographical comparison
        System.out.println("compareTo(): " + s1.compareTo(s2));


        /* 3️⃣ Joining / Creating New Strings */

        // concat() → join two strings
        System.out.println("concat(): " + s1.concat(" Language"));

        // valueOf() → convert other data type to string
        int number = 100;
        String numStr = String.valueOf(number);
        System.out.println("valueOf(): " + numStr);


        /* 4️⃣ Extracting Part of String */

        // substring() → extract part of string
        System.out.println("substring(2, 6): " + s1.substring(2, 6));

        // subSequence() → similar to substring
        System.out.println("subSequence(2, 6): " + s1.subSequence(2, 6));


        /* 5️⃣ Searching in String */

        // contains() → check if text exists
        System.out.println("contains(\"Java\"): " + s1.contains("Java"));

        // indexOf() → first occurrence index
        System.out.println("indexOf('J'): " + s1.indexOf('J'));

        // lastIndexOf() → last occurrence index
        System.out.println("lastIndexOf('a'): " + s1.lastIndexOf('a'));


        /* 6️⃣ Replacing Content */

        // replace() → replace characters or words
        System.out.println("replace(): " + s1.replace("Java", "Python"));


        /* 7️⃣ Case Conversion */

        // toUpperCase() → convert to uppercase
        System.out.println("toUpperCase(): " + s1.toUpperCase());

        // toLowerCase() → convert to lowercase
        System.out.println("toLowerCase(): " + s1.toLowerCase());


        /* 8️⃣ Removing Extra Spaces */

        // trim() → remove leading and trailing spaces
        String trimmed = s1.trim();
        System.out.println("trim(): '" + trimmed + "'");


        /* 9️⃣ Splitting String */

        // split() → split string into array
        String[] words = trimmed.split(" ");
        System.out.println("split():");
        for (String word : words) {
            System.out.println(word);
        }


        /* 🔟 Checking Start / End */

        // startsWith() → check starting characters
        System.out.println("startsWith(\"Core\"): " + trimmed.startsWith("Core"));

        // endsWith() → check ending characters
        System.out.println("endsWith(\"Programming\"): " + trimmed.endsWith("Programming"));


        /* 1️⃣1️⃣ Empty Check */

        // isEmpty() → true if string length is 0
        String empty = "";
        System.out.println("isEmpty(): " + empty.isEmpty());


        /* 1️⃣2️⃣ Converting String */

        // toCharArray() → convert string to char array
        char[] chars = trimmed.toCharArray();
        System.out.println("toCharArray():");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // getChars() → copy characters into char array
        char[] arr = new char[4];
        trimmed.getChars(0, 4, arr, 0);
        System.out.println("getChars():");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // toString() → returns string itself
        System.out.println("toString(): " + trimmed.toString());
    }
}
