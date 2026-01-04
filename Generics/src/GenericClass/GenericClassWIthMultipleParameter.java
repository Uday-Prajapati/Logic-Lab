package GenericClass;

class Pair<k,v>{
	k key;
	v value;
	
	Pair(k key, v value){
		this.key = key;
		this.value = value;
	}
	
	void display() {
		System.out.println(key + " : " + value);
	}
}
