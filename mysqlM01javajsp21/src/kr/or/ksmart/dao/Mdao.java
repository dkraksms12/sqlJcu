package kr.or.ksmart.dao;
/*import kr.or.ksmart.driverdb.DriverDB;*/
import kr.or.ksmart.dto.Member;

import java.sql.*;

public class Mdao {

	public void mInsert(Member m, Connection conn) throws SQLException{
		PreparedStatement pstmt = null;

		try{
			pstmt = conn.prepareStatement("insert into tb_member(m_id,m_pw,m_level,m_name,m_email)values(?,?,?,?,?)");
			pstmt.setString(1, m.getM_id());
			pstmt.setString(2, m.getM_pw());
			pstmt.setString(3, m.getM_level());
			pstmt.setString(4, m.getM_name());
			pstmt.setString(5, m.getM_email());
			pstmt.executeUpdate();
			
			

			}finally{
				pstmt.close();
				conn.close();
			}
		
	}
	
	public void mUpdate(Member m, Connection conn) throws SQLException{
		PreparedStatement pstmt = null;
		try{

			pstmt = conn.prepareStatement(
					"UPDATE tb_member SET m_pw=?,m_level=?,m_name=?,m_email=? WHERE m_id=?");

			pstmt.setString(1, m.getM_pw());
			pstmt.setString(2, m.getM_level());
			pstmt.setString(3, m.getM_name());
			pstmt.setString(4, m.getM_email());
			pstmt.setString(5, m.getM_id());
			
			System.out.println(pstmt + "<-- pstmt 2");
			
			pstmt.executeUpdate();
			
		}finally{
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
	}
	
	public void mDelete(String mId,Connection conn) throws SQLException{
		
		PreparedStatement pstmt = null;

		try{
			
			pstmt = conn.prepareStatement(
					"DELETE FROM tb_member WHERE m_id=?");
			pstmt.setString(1, mId);
			pstmt.executeUpdate();
			
		}finally{
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}

	}
	
	
}
