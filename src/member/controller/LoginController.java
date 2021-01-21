package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.service.Service;
import member.service.ServiceImpl;
import model.Member;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=euc-kr");
		response.setCharacterEncoding("euc-kr");
		
		//����� ������ ���� ��ü ����
		Service service = new ServiceImpl();
		
		//���ǻ���
		HttpSession session = request.getSession(); 
		
		//�α��ο� �ʿ��� �Ķ���͸� ����
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//id�ΰ˻�
		Member m = service.getMember(id);
		boolean flag = false;
		String path = "";
		
		if (m != null && pwd.equals(m.getPwd()) ) {
			int type = m.getType();
			session.setAttribute("id", id);
			session.setAttribute("type", type);
			
			
			flag = true;
			if(type ==1 ) {
				path="/seller/List";
				
			}else if(type==2){
				path="/order/list";
			}
			
		}
		session.setAttribute("flag", flag);
			
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
