package kr.or.ksmart.driverdb;
import java.sql.*;

public class DriverDB {
	public Connection driverDbcon() throws ClassNotFoundException, SQLException{
		System.out.println("01. driverDbcon");
		Class.forName("com.mysql.jdbc.Driver"); 
	
		Connection reconn = null;
		String jdbcDriver = "jdbc:mysql://localhost:3306/dev21db?" +
				"useUnicode=true&characterEncoding=euckr";
		String dbUser = "dev21id";
		String dbPass = "dev21pw";
		
		reconn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		
		return reconn;
	}

}


