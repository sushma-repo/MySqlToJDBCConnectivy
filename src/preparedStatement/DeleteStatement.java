package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStatement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university?useSSL=false","root","Sushu@4997");
		
		PreparedStatement ps=con.prepareStatement("Delete from employee where id=?");
		
		ps.setInt(1, 24);
		
		int result =ps.executeUpdate();
		System.out.println("result of delete record :" +result);
		
		con.close();
		
		
	}

}
