import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Simulation 1
		System.out.println("Enter Simulation 1 details");
		int id1 = Integer.parseInt(sc.nextLine().trim());
		
		String name1 = sc.nextLine().trim();
		String scientist1 = sc.nextLine();
		double funding1 = Double.parseDouble(sc.nextLine());
		
		String protein1 = sc.nextLine().trim();
		int month1 = Integer.parseInt(sc.nextLine().trim());
		int year1 = Integer.parseInt(sc.nextLine().trim());
		
		SimulationInfo s1 = new SimulationInfo(id1, name1, scientist1, funding1, protein1, month1, year1);

//		simulation 2
		System.out.println("Enter Simulation 2 details");
		int id2 = Integer.parseInt(sc.nextLine().trim());
		
		String name2 = sc.nextLine().trim();
		String scientist2 = sc.nextLine();
		double funding2 = Double.parseDouble(sc.nextLine());
		
		String protein2 = sc.nextLine().trim();
		int month2 = Integer.parseInt(sc.nextLine().trim());
		int year2 = Integer.parseInt(sc.nextLine().trim());
		
		SimulationInfo s2 = new SimulationInfo(id2, name2, scientist2, funding2, protein2, month2, year2);
		
//		Calculation
//		method call from simulation class
		int weeks1 = Simulation.getWeeksActive(month1, year1);
		int weeks2 = Simulation.getWeeksActive(month2, year2);
		
		System.out.println("Simulation Summary");
		
//		for s1
		System.out.println(name1 + " by " + s1.getLeadScientist());
		System.out.println("Months Active: " + month1);
		System.out.println("Impact Score: " + s1.calculateImpactScore(weeks1));
		System.out.println("Bio Load: " + s1.calculateBioLoad(weeks1));
		
//		for s2
		System.out.println(s1.getSimulationId() + " by " + s1.getLeadScientist());
		System.out.println("Months Active: " + month2);
		System.out.println("Impact Score: " + s1.calculateImpactScore(weeks2));
		System.out.println("Bio Load: " + s1.calculateBioLoad(weeks2));
		
//		get higher funding
		Simulation higher = s1.getHigherFundingSimulation(s1, s2);
		System.out.println("Higher Funding Experiment: " + ((SimulationInfo) higher).getSimulationName());
		
	}
}
