package mavenjdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteUpdateSelectUser {
public static void main(String[] args) throws Exception {
//	1.Load and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.Execute a query
	int value=statement.executeUpdate("Select * from User where id=2");

//	5.Close the connection
	
	
	System.out.println(value);
	connection.close();
	
	System.out.println("data fecthed successfully");
}
}
