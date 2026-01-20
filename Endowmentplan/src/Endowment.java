public abstract class Endowment {

    protected String endowmentId;
    protected String holderName;
    protected String endowmentType;
    protected String registrationDate;

    // Getter & Setter for endowmentId
    public void setEndowmentId(String endowmentId) {
        this.endowmentId = endowmentId;
    }

    public String getEndowmentId() {
        return endowmentId;
    }

    // Getter & Setter for holderName
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    // Getter & Setter for endowmentType
    public void setEndowmentType(String endowmentType) {
        this.endowmentType = endowmentType;
    }

    public String getEndowmentType() {
        return endowmentType;
    }

    // Getter & Setter for registrationDate
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    // Constructor
    public Endowment(String endowmentId, String holderName,
                     String endowmentType, String registrationDate) {
        this.endowmentId = endowmentId;
        this.holderName = holderName;
        this.endowmentType = endowmentType;
        this.registrationDate = registrationDate;
    }

    // Abstract method
    public abstract double calculateEndowment();
}
