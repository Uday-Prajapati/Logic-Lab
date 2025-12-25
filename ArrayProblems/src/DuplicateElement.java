public class DuplicateElement {

	public static void main(String[] args) {
		int [] arr = {1,2,3,3,4,5,5,6};
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j] && (i!=j)) {
					System.out.println("Duplicate Element is: " + arr[j]);
				}
				
			}
		}
	}
}
