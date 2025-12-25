public class SecondLargestElement {
    public static void main(String[] args) {
    	
    	// slow way
//        int [] arr = {1,2,3,4,5};
//        
//        int temp;
//
//        for(int i = 0; i<arr.length; i++){
//            for(int j = i+1; j<arr.length; j++){
//                if(arr[i] < arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.print("Largest element is: " + arr[1]);
    	
    	// fastest way
    	
    	int [] arr = {1,2,3,4,5};
    	
    	int largest = Integer.MIN_VALUE;
    	int second_largest = Integer.MIN_VALUE;
    	
    	for(int i = 0; i<arr.length; i++) {
    		if(arr[i] > largest) {
    			second_largest = largest;
    			largest = arr[i];
    		}
    		else if(arr[i] > second_largest && arr[i]!=largest) {
    			second_largest = arr[i];
    		}
    	}
    	System.out.println("Second largest is: " + second_largest);
    }
}

