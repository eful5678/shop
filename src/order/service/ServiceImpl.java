package order.service;

import java.util.ArrayList;

import model.Order;
import order.dao.Dao;
import order.dao.DaoImpl;

public class ServiceImpl implements Service {
	private Dao dao;
	public ServiceImpl() {
		dao = new DaoImpl();
	}
	@Override
	public void addOrder(Order o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order getOrder(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Order> orderList(String o_id, int o_state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editState(String type, int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delOrder(int num) {
		// TODO Auto-generated method stub
		
	}

}
