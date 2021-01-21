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
		// TODO Auto-generated method stub
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=EUC-KR");
		response.setCharacterEncoding("euc-kr");
		String path = "/view/member/loginForm.jsp";
		// 기능을 제공할 서비스 객체 생성
		Service service = new ServiceImpl();

		// 세션 생성
		HttpSession session = request.getSession();

		// 로그인에 필요한 요청 파라메터을 읽는다.
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		int type = 0;
		// id로 멤버 검색
		Member m = service.getMember(id);
		if (m != null && pwd.equals(m.getPwd())) {
			type = m.getType();
			session.setAttribute("id", id);
			session.setAttribute("memberType", type);
			if (type == 1) {
				System.out.println("LoginController.doGet()");
				path = "/seller/List";
			} else if (type == 2) {
				path = "/order/list";
			}
		}

		// 메뉴 페이지로 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		if (dispatcher != null) {
			dispatcher.forward(request, response);
			System.out.println("LoginController.doGet()");
		}
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
