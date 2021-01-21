package product.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;
import product.service.Service;
import product.service.ServiceImpl;

/**
 * Servlet implementation class DetailController
 */
@WebServlet("/seller/detail")
public class DetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public DetailController() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. member.type과 product.num을 받아오기 위해 기존의 Session 객체를 가져온다.
		HttpSession session = request.getSession(false);
		int type = (Integer) session.getAttribute("memberType");
		int num = Integer.parseInt(request.getParameter("num"));
		
		// 2. 클릭한 num을 이용하여 해당 num을 가진 product를 가져오기 위해 service 클래스 객체를 선언한다.
		Service service = new ServiceImpl();
		Product p = service.getProduct(num);

		// 3. request.setAttribute로 detail.jsp(order나 seller 둘 다)가 requestScope로 값을 받을 수 있게 함.
		request.setAttribute("p", p);
		
		// 4. requestDispatcher로 이동
		String path = "/view/seller/detail.jsp";
		if (type == 2) {
			path = "/view/order/detail.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
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
