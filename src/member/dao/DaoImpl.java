package  member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import conn.DBConnect;
import model.Member;


public class DaoImpl implements Dao {
	
	
	private DBConnect db;
	 
	public DaoImpl() {
		db = DBConnect.getInstance();
	}

		
	
	public void insert(Member m) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		String sql = "INSERT INTO shop_member VALUES(?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getEmail());
			pstmt.setString(5, m.getAddr());
			pstmt.setInt(6, m.getType());
			
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Member select(String id) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	
	
	public void update(Member m) {
		// TODO Auto-generated method stub
		
	}

	
	
	public void delete(String id) {
		// TODO Auto-generated method stub
		
		
	}

}
