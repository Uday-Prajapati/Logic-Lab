public class DataCenter {

    private String dataCenterId;
    private String Location;
    private String supervisionName;
    private double coolingPowerUsage;

    // Getter and Setter methods
    public String getDataCenterId() {
        return dataCenterId;
    }

    public void setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
    }

    public String getLocaion() {   // (as used consistently)
        return Location;
    }

    public void setLocaion(String location) {
        Location = location;
    }

    public String getSupervisionName() {
        return supervisionName;
    }

    public void setSupervisionName(String supervisionName) {
        this.supervisionName = supervisionName;
    }

    public double getCoolingPowerusage() {
        return coolingPowerUsage;
    }

    public void setCoolingPowerusage(double coolingPowerusage) {
        this.coolingPowerUsage = coolingPowerusage;
    }

    // Constructor
    public DataCenter(String dataCenterId, String location,
                      String supervisionName, double coolingPowerUsage) {
        this.dataCenterId = dataCenterId;
        this.Location = location;
        this.supervisionName = supervisionName;
        this.coolingPowerUsage = coolingPowerUsage;
    }
}
