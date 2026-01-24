import java.util.*;

public class NumAvg {

    private TreeSet<Integer> numSet=new TreeSet<Integer>();

    // Write code for getter and setter
    public TreeSet<Integer> getNumSet(){
    	return numSet;
    }
    
    public void  setNumSet(TreeSet<Integer> numSet) {
    	this.numSet = numSet;
    }

    
    public void addNum(int num)
    {
	    // code here
    	if(num % 5 != 0 && num % 6 != 0) {
    		numSet.add(num);
    	}
    }

    public double calAvg()
    {
	    // code here
    	if(numSet.isEmpty()) {
    		return 0.0;
    	}
    	
    	double sum = 0;
    	for(int num : numSet) {
    		sum += num;
    	}
    	return sum / numSet.size();
    }
    
}
