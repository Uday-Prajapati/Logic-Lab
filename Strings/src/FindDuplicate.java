public class FindDuplicate {

    public static void main(String[] args) {
        String s = "programming";

        char[] arr = s.toCharArray(); // Step 1

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            if (arr[i] == '0') continue; // Step 3

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0'; // Step 5
                }
            }

            if (count > 1)
                System.out.print(arr[i]); // Step 6
        }
    }
}
