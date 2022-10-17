package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DataBase {

	public static void main(String[] args) throws SQLException {
		String key="webdriver.chrome.driver";
		String value="./chromedriver.exe";
		System.setProperty(key, value);
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
       java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		java.sql.Statement stat=conn.createStatement();
		String selectQuery="select*from student";
		ResultSet result=stat.executeQuery(selectQuery);
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		}
		conn.close();

	}

}
