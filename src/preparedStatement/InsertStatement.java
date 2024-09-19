package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university?useSSL=false","root","Sushu@4997");
			
			PreparedStatement ps=con.prepareStatement("insert into employee values (?,?,?)");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Id:");
			int id=sc.nextInt();
			sc.nextLine(); 
			
			System.out.println("Enter Name:");
			String name=sc.nextLine();
			
			System.out.println("Enter Salary:");
			double Salary=sc.nextDouble();
			
	        
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, Salary);
			
			
			int result =ps.executeUpdate();
			System.out.println("result of Insert record :" +result);
			
			con.close();
			
			

	}

}
