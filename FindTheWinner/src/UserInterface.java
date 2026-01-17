import java.util.Scanner;

class FindTheWinner{
	private String teamName;
	private float totalTime;
	
	// detail and calaulate total time
	public boolean setDetail(String input) {
		String[] data = input.split(":");
		
		teamName = data[0];
		totalTime = 0;
		
		for(int i=1; i<=4; i++) {
			float time = Float.parseFloat(data[i]);
			if(time < 1) {
				System.out.println("Invalid number");
				return false;
			}
			totalTime += time;
		}
		return true;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public float getTotalTime() {
		return totalTime;
	}
}
	
	
public class UserInterface {
	
    public static void main(String args[])
    {
        // fill the code here
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the number of teams");
        int noOfTeam = sc.nextInt();
        sc.nextLine();
        
        if( noOfTeam < 2) {
        	System.out.println(noOfTeam + " is an invalid input");
        	return;
        }
        
        // enter the details
        System.out.println("Enter the details");
        
        float minTime = Float.MAX_VALUE;
        String winningTeam = "";
        
        for(int i=0; i<noOfTeam; i++) {
        	
        	String input = sc.nextLine();
        	FindTheWinner team = new FindTheWinner();
        	
        	if (!team.setDetail(input)) {
                return; 
            }
            
            // winner update smaller time
            if(team.getTotalTime() < minTime) {
            	minTime = team.getTotalTime();
            	winningTeam = team.getTeamName();
            }
        }
        
        System.out.printf("%s team wins the race in %.2f minutes", winningTeam, minTime);
    }
}
