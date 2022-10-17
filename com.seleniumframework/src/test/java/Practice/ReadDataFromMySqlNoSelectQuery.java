package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ReadDataFromMySqlNoSelectQuery {

	public static void main(String[] args) throws Throwable {
		//Step:1:Register or load the MySQL database
		
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		
		//Step 2:Get connect to database
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		//Step 3:create SQL statement
		
	    Statement stat=conn .createStatement();
		String query="insert into student(first_name,last_name,address)values('raju','BN','INDIA')";
		//step 4:execute query
		int result=stat.executeUpdate(query);
		if(result==1)
		{
			System.out.println("user is created");
		}
		else
		{
			System.out.println("user is not created");
		}
		//close the connection
		conn.close();
	}

}
