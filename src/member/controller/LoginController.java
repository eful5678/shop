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

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=EUC-KR");
		response.setCharacterEncoding("euc-kr");

		String path = "/view/member/loginForm.jsp";
		
		Service service = new ServiceImpl();
		
		HttpSession session = request.getSession();

		String id = request.getParameter("id"); 
		String pwd = request.getParameter("pwd");

		int type = 0;

		Member m = service.getMember(id);
		if (m != null && pwd.equals(m.getPwd())) {
			type = m.getType();
			session.setAttribute("id", id);
			session.setAttribute("memberType", type);
			if (type == 1) {
				path = "/seller/List";
			} else if (type == 2) {
				path = "/order/list";
			}
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		if (dispatcher != null) {
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
