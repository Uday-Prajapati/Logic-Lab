import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DataCenterUtil {

    // LinkedHashSet as required
    private Set<DataCenter> dataCenterSet = new LinkedHashSet<>();

    public Set<DataCenter> getDataCenterSet() {
        return dataCenterSet;
    }

    public void setDataCenterSet(Set<DataCenter> dataCenterSet) {
        this.dataCenterSet = dataCenterSet;
    }

    // Requirement 1: Add DataCenter
    public void addDataCenter(DataCenter dataCenter) {
        dataCenterSet.add(dataCenter);
    }

    // Requirement 2: Get DataCenter by ID (case-sensitive)
    public DataCenter getDataCenterById(String dataCenterId) {
        for (DataCenter dc : dataCenterSet) {
            if (dc.getDataCenterId().equals(dataCenterId)) {
                return dc;
            }
        }
        return null;
    }

    // Requirement 3: Get DataCenters with maximum cooling power usage
    public List<DataCenter> getDataCentersWithMaximumCoolingPowerUsage() {

        List<DataCenter> resultList = new ArrayList<>();
        double maxPowerUsage = 0.0;

        // Find maximum power usage
        for (DataCenter dc : dataCenterSet) {
            if (dc.getCoolingPowerusage() > maxPowerUsage) {
                maxPowerUsage = dc.getCoolingPowerusage();
            }
        }

        // Collect all data centers with max power usage
        for (DataCenter dc : dataCenterSet) {
            if (dc.getCoolingPowerusage() == maxPowerUsage) {
                resultList.add(dc);
            }
        }

        return resultList;
    }
}
