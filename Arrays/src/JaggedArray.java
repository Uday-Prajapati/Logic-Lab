
public class JaggedArray {

	public static void main(String[] args) {
		int nums[][] = new int[3][];
		
		nums[0] = new int[]{1,2,3};
		nums[1] = new int[]{1,2,3,4};
		nums[2] = new int[]{1,2,3,4,5};
		
		for(int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		// enhanced for loop
		for (int[] row : nums) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }	
	}
}
