package MySqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university?useSSL=false","root","Sushu@4997");
		
		Statement st= con.createStatement();
		
		int result =st.executeUpdate("update employee set salary=1000 where id=15");
		
		System.out.println("Result: " +result);
		
		con.close();
		
		

	}

}
