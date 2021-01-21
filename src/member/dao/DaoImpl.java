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
		
	}

	public Member select(String id) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Member m = null;
		String sql = "select*from shop_member where id = ?";
	
		
		try {
			conn=db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				m = new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return m;
	}
	
	
	public void update(Member m) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update shop_member set pwd=?, name=?, email=?, addr=? where id=?";
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getPwd());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getAddr());
			pstmt.setString(5, m.getId());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	
	
	public void delete(String id) {
		// TODO Auto-generated method stub
		
		
	}

}
