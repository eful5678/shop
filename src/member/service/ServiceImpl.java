package member.service;

import member.dao.Dao;
import member.dao.DaoImpl;
import model.Member;


public class ServiceImpl implements Service {

	private Dao dao;

	public ServiceImpl() {
		this.dao = new DaoImpl();
	}

	public void join(Member m) {
		// TODO Auto-generated method stub
		
	}

	public Member getMember(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void editMember(Member m) {
		// TODO Auto-generated method stub
		
	}

	public void remMember(String id) {
		// TODO Auto-generated method stub
		
	}

	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		Member m = dao.select(id);
		if (m == null || !m.getPwd().equals(pwd)) {
			return false;
		} else {
			return true;
		}
	}

}
