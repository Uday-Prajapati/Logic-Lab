import java.sql.Connection;
import java.sql.PreparedStatement;

public class FlightManagementSystem
{
   //Fill the code here
	public boolean deleteFlight(int flightId) {
		
		boolean isDelete = false;
		
		try {
			// connection 
			Connection con = DB.getConnection();
			
			// write query
			String query = "Delete from flight where flightId = ?";
			
			// prepare statement
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, flightId);
			
			// stire update in variable
			int row = ps.executeUpdate();
			
			// confirm delete
			if(row > 0) {
				isDelete = true;
			}else {
				isDelete = false;
			}
			ps.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isDelete;	
	}
}