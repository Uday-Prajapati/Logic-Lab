public class ExperimentInfo implements Experiment {

    private int experimentId;
    private String experimentTitle;
    private String leadResearcher;
    private double fundingAmount;
    private String complexityLevel;
    private int initiationMonth;
    private int initiationYear;

    // Constructor
    public ExperimentInfo(int experimentId, String experimentTitle, String leadResearcher,
                          double fundingAmount, String complexityLevel,
                          int initiationMonth, int initiationYear) {
        this.experimentId = experimentId;
        this.experimentTitle = experimentTitle;
        this.leadResearcher = leadResearcher;
        this.fundingAmount = fundingAmount;
        this.complexityLevel = complexityLevel;
        this.initiationMonth = initiationMonth;
        this.initiationYear = initiationYear;
    }

    // Getters
    public int getExperimentId() {
        return experimentId;
    }

    public String getExperimentTitle() {
        return experimentTitle;
    }

    public String getLeadResearcher() {
        return leadResearcher;
    }

    public double getFundingAmount() {
        return fundingAmount;
    }

    public String getComplexityLevel() {
        return complexityLevel;
    }

    public int getInitiationMonth() {
        return initiationMonth;
    }

    public int getInitiationYear() {
        return initiationYear;
    }

    // Calculate Innovation Score
    @Override
    public double calculateInnovationScore(int monthsActive) {
        double multiplier = 0;

        if (complexityLevel.equals("QubitOpt")) {
            multiplier = 1.5;
        } else if (complexityLevel.equals("Entanglement")) {
            multiplier = 2.5;
        } else if (complexityLevel.equals("Cryptography")) {
            multiplier = 3.5;
        }

        return (multiplier * monthsActive * fundingAmount) / 1000;
    }

    // Calculate Resource Consumption
    @Override
    public double calculateResourceConsumption(int monthsActive) {
        double rate = 0;

        if (complexityLevel.equals("QubitOpt")) {
            rate = 0.8;
        } else if (complexityLevel.equals("Entanglement")) {
            rate = 1.2;
        } else if (complexityLevel.equals("Cryptography")) {
            rate = 1.8;
        }

        double value = (monthsActive * rate * fundingAmount) / 100;
        return Math.round(value * 10.0) / 10.0;
    }
}
