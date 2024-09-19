package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university?useSSL=false","root","Sushu@4997");
		
		Statement st=con.createStatement();
		
		ResultSet rs= st.executeQuery("select * from employee");
		
		
		while(rs.next()) {
			
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int salary =rs.getInt("salary");
			
			System.out.println(id +" "+name+" "+salary);
			
		}
		
		con.close();
		
		
		

	}

}
