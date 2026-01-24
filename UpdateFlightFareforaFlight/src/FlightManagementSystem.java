import java.sql.Connection;
import java.sql.PreparedStatement;

public class FlightManagementSystem
{
   //Fill the code here
	public boolean updateFlightFare(int flightId,double flightFare) {
		
		boolean isUpdate = false;
		try {
			Connection con = DB.getConnection();
			
			// query
			String query = "update flight set flightFare = ? where flightId = ?";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setDouble(1,flightFare);
			ps.setInt(2, flightId);
			
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				isUpdate = true;
			}
			ps.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isUpdate;
	}
}