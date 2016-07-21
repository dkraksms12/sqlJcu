package kr.or.ksmart.dao;

import java.sql.*;
import kr.or.ksmart.driverdb.DriverDB;
import kr.or.ksmart.dto.User;

public class Udao {

	public void uInsert(User u) throws ClassNotFoundException, SQLException{
		
		Connection conn = null;
		DriverDB db = new DriverDB();
		conn = db.driverDbcon();
		System.out.println(conn+"<--conn");
		PreparedStatement pstmt = null;
		
		try{
			
			pstmt = conn.prepareStatement("insert into tb_user(u_id,u_pw,u_level,u_name,u_email,u_phone,u_addr)values(?,?,?,?,?,?,?)");
			pstmt.setString(1, u.getU_id() );
			pstmt.setString(2, u.getU_pw());
			pstmt.setString(3, u.getU_level());
			pstmt.setString(4, u.getU_name());
			pstmt.setString(5, u.getU_email());
			pstmt.setString(6, u.getU_phone());
			pstmt.setString(7, u.getU_addr());
			pstmt.executeUpdate();
			System.out.println(u.getU_id()+"<--u.getU_id()");
		}finally{
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}

		}
	}
	
public void uDelete(User u) throws ClassNotFoundException, SQLException{
		
		Connection conn = null;
		DriverDB db = new DriverDB();
		conn = db.driverDbcon();
		System.out.println(conn+"<--conn");
		PreparedStatement pstmt = null;
		
		try{
			
			pstmt = conn.prepareStatement("delete  from tb_user where u_id='?'");
			pstmt.setString(1, u.getU_id() );

			pstmt.executeUpdate();
			System.out.println(u.getU_id()+"<--u.getU_id()");
		}finally{
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}

		}
		
		
		


	}
}
