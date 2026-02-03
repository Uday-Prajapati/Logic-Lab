import java.util.HashSet;

public class ClassHouseFormation {

    // Attribute must be private
    private HashSet<String> studSet = new HashSet<String>();

    // Getter
    public HashSet<String> getStudSet() {
        return studSet;
    }

    // Setter
    public void setStudSet(HashSet<String> studSet) {
        this.studSet = studSet;
    }

    // Requirement 1
    public void addName(String details) {
    	String[] parts = details.split(":");
    	if(parts.length == 2) {
    		String name = parts[1];
    		studSet.add(name);
    	}
    }

    // Requirement 2
    public HashSet<String> formTeam() {

        HashSet<String> resultSet = new HashSet<String>();
        for(String name : studSet) {
        	 char firstChar = Character.toUpperCase(name.charAt(0));
        	 
        	 String house;
        	 
        	 if(firstChar >= 'A' || firstChar <= 'H') {
        		 house = "RED";
        	 }
        	 else if(firstChar >= 'A' || firstChar <= 'H') {
        		 house = "BLUE";
        	 }
        	 else {
        		 house = "GREEN";
        	 }
        	 
        	 resultSet.add(name + ":" + house);
       
        }
        return resultSet;
    }
}
