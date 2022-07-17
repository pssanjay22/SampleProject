package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class SelectQueryTest 
{

	public static void main(String[] args) throws SQLException
	{
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		Statement stat = conn.createStatement();
		String qurey = "select * from students_info";
		ResultSet resultset = stat.executeQuery(qurey);
		while(resultset.next()) {
		System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4));
		
		}
	conn.close();
	}

}
