package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectStatement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university?useSSL=false","root","Sushu@4997");
		
		PreparedStatement ps=con.prepareStatement("Select * from employee");
		ResultSet rs= ps.executeQuery();
		
           while(rs.next()) {
			
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int salary =rs.getInt("salary");
			
			System.out.println(id +" "+name+" "+salary);
			
		}
		
	}

}
