package com.application;

import java.util.Map;
import java.util.*;

public class VehicleRegistry {

    private Map<String, Double> vehicleDetailsMap = new HashMap<>();

    // Getter
    public Map<String, Double> getVehicleDetailsMap() {
        return vehicleDetailsMap;
    }

    // Setter
    public void setVehicleDetailsMap(Map<String, Double> vehicleDetailsMap) {
        this.vehicleDetailsMap = vehicleDetailsMap;
    }

    // method
    public void addVehicleDetails(String registrationNumber, double registrationFee) {
        vehicleDetailsMap.put(registrationNumber, registrationFee);
    }

    public double findTotalFeeInRange(double minFee, double maxFee) {
        double total = 0.0;

        for (double fee : vehicleDetailsMap.values()) {
            if (fee >= minFee && fee <= maxFee) {
                total += fee;
            }
        }
        return total;
    }

    public boolean updateRegistrationFee(String registrationNumber, double newFee) {
        if (vehicleDetailsMap.containsKey(registrationNumber)) {
            vehicleDetailsMap.put(registrationNumber, newFee);
            return true;
        }
        return false;
    }

 
    public boolean removeVehicle(String registrationNumber) {
        if (vehicleDetailsMap.containsKey(registrationNumber)) {
            vehicleDetailsMap.remove(registrationNumber);
            return true;
        }
        return false;
    }

    public List<String> searchVehiclesByPartialNumber(String partialNumber) {
        List<String> result = new ArrayList<>();

        for (String regNo : vehicleDetailsMap.keySet()) {
            if (regNo.contains(partialNumber)) {
                result.add(regNo);
            }
        }
        return result;
    }
}
