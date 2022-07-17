package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonselectQueryTest {

	public static void main(String[] args) throws SQLException {
		 Connection conn = null;
		 int result = 0;
		try {		
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			Statement stat = conn.createStatement();
			String query = "insert into students_info values ('4','chandu','gowda','s')";
			result=stat.executeUpdate(query);
		}
		catch(Exception e) {
		}finally {
			if(result==1)
			{
				System.out.println("Values are inserted succesfully");
			}
			else {
				System.out.println("Values are not inserted");
			}
				conn.close();
		}
	}

}
