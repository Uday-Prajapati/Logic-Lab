public class ThirdArray {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3};
		int [] arr2 = {4,5,6};
		
		int [] arr3 = new int[arr1.length + arr2.length];
		
		int index = 0;
		
//		copying arr1 to arr2
		
		for(int i = 0; i<arr1.length; i++) {
			arr3[index] = arr1[i];
			index++;
		}
		
//		copying arr2 to arr3

		for(int i = 0; i<arr2.length; i++) {
			arr3[index] = arr2[i];
			index++;
		}
		
		System.out.print("Index Third: ");
		for(int i = 0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
	}
}
