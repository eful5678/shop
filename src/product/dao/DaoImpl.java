package product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import conn.DBConnect;
import model.Product;

public class DaoImpl implements Dao {
	
	private DBConnect db;
	
	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	

	public void insert(Product p) {
		// TODO Auto-generated method stub
		
		
		
	}

	
	public Product select(int num) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Product p = null;
		try {
			String sql = "SELECT * FROM shop_product WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));	
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return p;
	}
	
	public ArrayList<Product> selectAllById(String s_id) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	

	public void update(Product p) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		String sql = "UPDATE shop_product SET name=?, quantity=?, price=?, content=? WHERE num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(5, p.getNum());
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getQuantity());
			pstmt.setInt(3, p.getPrice());
			pstmt.setString(4, p.getContent());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void delete(int num) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM shop_product WHERE num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public int selectNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

	
	public ArrayList<Product> selectAll() {
		// TODO Auto-generated method stub
		
		
		
		return null;
	}

	
	
	public void updateQuantity(int q, int num) {
		// TODO Auto-generated method stub
		

		
	}



	

}
