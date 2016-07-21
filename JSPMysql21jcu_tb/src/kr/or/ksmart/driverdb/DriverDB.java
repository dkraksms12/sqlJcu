package kr.or.ksmart.driverdb;
import java.sql.*;

public class DriverDB {

	public Connection driverDbcon() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver"); 
		
		Connection reconn = null;
		String jdbcDriver = "jdbc:mysql://localhost:3306/db01jcu?" +
				"useUnicode=true&characterEncoding=euckr";
		String dbUser = "dbid01jcu";
		String dbPass = "dbpw01jcu";
		
		reconn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		
		
		return reconn;
	}
}
