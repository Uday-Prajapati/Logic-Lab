import java.time.LocalDate;

public interface Experiment {

    // Abstract method to calculate innovation score
    public double calculateInnovationScore(int monthsActive);

    // Abstract method to calculate resource consumption
    public double calculateResourceConsumption(int monthsActive);

    // Default method to find higher impact experiment based on funding amount
    public default Experiment getHigherImpactExperiment(Experiment e1, Experiment e2) {
        if (((ExperimentInfo) e1).getFundingAmount() >
            ((ExperimentInfo) e2).getFundingAmount()) {
            return e1;
        }
        return e2;
    }

    // Static method to calculate months active
    public static int getMonthsActive(int initiationMonth, int initiationYear) {
        LocalDate currentDate = LocalDate.now();
        return (currentDate.getYear() - initiationYear) * 12 +
               (currentDate.getMonthValue() - initiationMonth);
    }
}
