class TwoDimension {
    public static void main(String[] args) {

        // Declare and initialize 2D array
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Print 2D array elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
     // Enhanced for loop
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
