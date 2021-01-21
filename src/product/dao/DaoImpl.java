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
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		String sql = "insert into shop_product values(?, ?, ?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, p.getNum());
			pstmt.setString(2, p.getName());
			pstmt.setInt(3, p.getQuantity());
			pstmt.setInt(4, p.getPrice());
			pstmt.setString(5, p.getImg());
			pstmt.setString(6, p.getContent());
			pstmt.setString(7, p.getS_id());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Product select(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Product> selectAllById(String s_id) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		ResultSet rs = null;
		ArrayList<Product> products = new ArrayList<Product>();
		PreparedStatement pstmt = null;

		String sql = "select * from shop_product where s_id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				products.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return products;
	}

	public void update(Product p) {
		// TODO Auto-generated method stub
	}

	public void delete(int num) {
		// TODO Auto-generated method stub
	}

	@Override
	public int selectNum() {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		ResultSet rs = null;
		PreparedStatement pstmt = null;

		String sql = "select seq_shop_product.nextval from dual";
		int num = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				num = rs.getInt(1);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return num;
	}

	public ArrayList<Product> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Product> products = new ArrayList<Product>();
		ResultSet rs = null;
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		String sql = "select * from shop_product";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				products.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7)));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return products;
	}

	public void updateQuantity(int q, int num) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		String sql = "update shop_product set quantity=quantity-? where num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, q);
			pstmt.setInt(2, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
