package order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.Order;

public class DaoImpl implements Dao {
	private DBConnect db;

	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	@Override
	public void insert(Order o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order select(int num) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public ArrayList<Order> selectAll(String o_id, int o_state) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String type, int num) {
		// TODO Auto-generated method stub
		
	}
}
