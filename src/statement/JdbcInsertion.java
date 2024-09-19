package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university?useSSL=false","root","Sushu@4997");
		
		Statement st=con.createStatement();
		
	   int result=	st.executeUpdate("insert into employee values (15,'priya',250000)");
	   
	   System.out.println("Jdbc Insertion: " +result);
	   
	   con.close();
		

	}

}
