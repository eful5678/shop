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
		// TODO Auto-generated method stub
		
		
		return null;
	}
	
	public ArrayList<Product> selectAllById(String s_id) {
		// TODO Auto-generated method stub
		
		
		return null;
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
