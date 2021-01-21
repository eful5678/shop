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

		// 1. member.type�� product.num�� �޾ƿ��� ���� ������ Session ��ü�� �����´�.
		HttpSession session = request.getSession(false);
		int type = (Integer) session.getAttribute("memberType");
		int num = Integer.parseInt(request.getParameter("num"));
		
		// 2. Ŭ���� num�� �̿��Ͽ� �ش� num�� ���� product�� �������� ���� service Ŭ���� ��ü�� �����Ѵ�.
		Service service = new ServiceImpl();
		Product p = service.getProduct(num);

		// 3. request.setAttribute�� detail.jsp(order�� seller �� ��)�� requestScope�� ���� ���� �� �ְ� ��.
		request.setAttribute("p", p);
		
		// 4. requestDispatcher�� �̵�
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
