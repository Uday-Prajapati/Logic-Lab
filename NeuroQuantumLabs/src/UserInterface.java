import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Experiment 1 --------
        System.out.println("Enter Experiment 1 details:");
        int id1 = Integer.parseInt(sc.nextLine().trim());

        String title1 = sc.nextLine().trim();
        String researcher1 = sc.nextLine().trim();
        double funding1 = Double.parseDouble(sc.nextLine().trim());

        String level1 = sc.nextLine().trim();
        int month1 = Integer.parseInt(sc.nextLine().trim());
        int year1 = Integer.parseInt(sc.nextLine().trim());

        ExperimentInfo e1 = new ExperimentInfo(
                id1, title1, researcher1, funding1, level1, month1, year1);

        // -------- Experiment 2 --------
        System.out.println("Enter Experiment 2 details:");
        int id2 = Integer.parseInt(sc.nextLine().trim());

        String title2 = sc.nextLine().trim();
        String researcher2 = sc.nextLine().trim();
        double funding2 = Double.parseDouble(sc.nextLine().trim());

        String level2 = sc.nextLine().trim();
        int month2 = Integer.parseInt(sc.nextLine().trim());
        int year2 = Integer.parseInt(sc.nextLine().trim());

        ExperimentInfo e2 = new ExperimentInfo(
                id2, title2, researcher2, funding2, level2, month2, year2);

        // -------- Calculations --------
        int months1 = Experiment.getMonthsActive(month1, year1);
        int months2 = Experiment.getMonthsActive(month2, year2);

        // -------- Output --------
        System.out.println("Experiment Summary:");

        System.out.println(e1.getExperimentTitle() + " by " + e1.getLeadResearcher());
        System.out.println("Months Active: " + months1);
        System.out.println("Innovation Score: " + e1.calculateInnovationScore(months1));
        System.out.println("Resource Consumption: " + e1.calculateResourceConsumption(months1));

        System.out.println(e2.getExperimentTitle() + " by " + e2.getLeadResearcher());
        System.out.println("Months Active: " + months2);
        System.out.println("Innovation Score: " + e2.calculateInnovationScore(months2));
        System.out.println("Resource Consumption: " + e2.calculateResourceConsumption(months2));

        Experiment higher = e1.getHigherImpactExperiment(e1, e2);
        System.out.println("Higher Impact Experiment: " +
                ((ExperimentInfo) higher).getExperimentTitle());

        sc.close();
    }
}
