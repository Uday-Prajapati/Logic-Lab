class OneDimension {
    public static void main(String[] args) {

        // 1-D array initialization
        int[] arr = {10, 20, 30, 40, 50};

        // Using normal for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Using enhanced for loop
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
