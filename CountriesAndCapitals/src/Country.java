import java.util.Map;
import java.util.HashMap;

public class Country {
    
    private Map<String,String> countryMap=new HashMap<String,String>();

    // Write code for getter and setter
    
    // getter
    public Map<String, String> getCountryMap(){
    	return countryMap;
    }
    
    // setter
    public void setCountryMap(Map<String, String> countryMap) {
    	this.countryMap = countryMap;
    }

    public void add(String cname,String capname)
    {
	    // Code here
    	countryMap.put(cname.toLowerCase(), capname);
    }

    public String search(String cname)
    {
	    // Code  here
	    if(countryMap.containsKey(cname.toLowerCase())) {
	    	return  countryMap.get(cname.toLowerCase());
	    }
	    return "Data not found";
    }
}
