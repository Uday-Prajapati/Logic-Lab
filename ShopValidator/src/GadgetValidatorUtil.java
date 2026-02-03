public class GadgetValidatorUtil {
    public boolean validateGadgetID(String gadgetID) throws InvalidGadgetException {
        // Fill the code here
    	if(gadgetID.matches("[A-Z]\\d{3}")) {
    		return true;
    	}else {
    		throw new InvalidGadgetException("Invalid gadget ID");
    	} 
    }

    public boolean validateWarrantyPeriod(int period) throws InvalidGadgetException {
        // Fill the code here
    	boolean flag = false;
    	
    	if(period >= 6 && period <= 36) {
    		flag = true;
    	}else {
    		throw new InvalidGadgetException("Invalid warranty period");
    	}
        return flag;
    }
}
