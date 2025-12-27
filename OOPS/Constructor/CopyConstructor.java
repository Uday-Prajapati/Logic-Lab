public class CopyConstructor {
    int id;
    String name;

    // Parameterized constructor
    CopyConstructor(int i, String n){
    	id = i;
    	name = n;
    }
    
    // copy constructor
    CopyConstructor(CopyConstructor obj){
    	id = obj.id;
    	name = obj.name;
    }

    public static void main(String[] args) {
    	CopyConstructor s1 = new CopyConstructor(101,"uday");
    	CopyConstructor s2 = new CopyConstructor(s1);
    	
    	System.out.println(s1.id + " " +s1.name);
    	System.out.println(s2.id + " " +s2.name);

    }
}
