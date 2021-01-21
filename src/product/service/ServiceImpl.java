package product.service;

import java.util.ArrayList;

import model.Product;
import product.dao.Dao;
import product.dao.DaoImpl;


public class ServiceImpl implements Service {
	private Dao dao;

	public ServiceImpl() {
		this.dao = new DaoImpl();
	}

	public void add(Product p) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Product> getProductsById(String s_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProduct(int num) {
		// TODO Auto-generated method stub
		return dao.select(num);
	}

	public void editProduct(Product p) {
		dao.update(p);
	}

	public void delProduct(int num) {
		dao.delete(num);
	}

	public int makeNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Product> getProductAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product editQuantity(int q, int num) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
