package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university?useSSL=false","root","Sushu@4997");
			
			PreparedStatement ps=con.prepareStatement("update employee set salary=? where id=?");
			
			ps.setDouble(1, 350);
			ps.setInt(2, 32);
			
			int result =ps.executeUpdate();
			System.out.println("result of update record :" +result);
			
			con.close();
			
			

	}

}
