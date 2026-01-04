
public class BasicOperation {

	public static void main(String[] args) {
//		// insertion operation
//		int [] arr = {10,20,30,40,50};
//		
//		int indexPos = 2;
//		int elementToAdd = 100;
//		
//		// creating new array
//		int [] newArr = new int[arr.length+1];
//		
//		for(int i = 0; i<indexPos; i++) {
//			newArr[i] = arr[i];
//		}
//		
//		newArr[indexPos] = elementToAdd;
//		
//		for(int i = indexPos; i<arr.length; i++) {
//			newArr[i+1] = arr[i];
//		}
//		
//		for(int num : newArr) {
//			System.out.print(num + " ");
//		}
		
		
		// Deletion operation
//		int [] arr = {10,20,30,40,50};
//		int indexPos = 1;
//		
//		int [] newArr = new int[arr.length-1];		
//		int j = 0;
//		
//		for(int i = 0; i<arr.length; i++) {
//			// delete index 1 i. skip
//			if(i == indexPos) {
//				continue;
//			}
//			
//			// copy paste old array element into new element
//			newArr[j] = arr[i];
//			j++;
//		}
//		
//		for(int num : newArr) {
//			System.out.print(num + " ");
//		}
		
		// Searching an element
//		int [] arr = {10,20,30,40};
//		int element = 30;
//		
//		boolean found = false;
//		
//		for(int i = 0; i<arr.length; i++) {
//			
//			// if element found
//			if(arr[i] == element) {
//				System.out.print("Element Found at " + i + " index position");
//				found = true;
//				break;
//			}
//		}
//		
//		if(found == false) {
//			System.out.println("Not Found");
//		}
		
		
		// updating the element
		int [] arr = {10,20,30,40,50};
		
		int indexPos = 2;
		int elementToUpdate = 100;
		
		// this line will update the element at index 2
		arr[indexPos] = elementToUpdate;
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
