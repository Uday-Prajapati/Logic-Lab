public class FindSortedArray {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int n = arr.length;
		
		boolean sorted = true;
		for(int i = 0; i<n-1; i++) {
			if(arr[i] > arr[i+1]) {
				sorted = true;
				break;
			}
		}
		if(sorted) {
			System.out.println("Sorted");
		}else {
			System.out.println("Not Sorted");
		}
	}
}
