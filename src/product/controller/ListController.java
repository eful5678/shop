package product.controller;

import java.io.IOException;
import java.util.ArrayList;

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


@WebServlet("/seller/List")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Service service = new ServiceImpl();
		
		HttpSession session = request.getSession(false);
		
		String s_id = (String) session.getAttribute("id");
		
		ArrayList<Product> products = service.getProductsById(s_id);
		
		request.setAttribute("products", products);
		
		String path = "/view/seller/list.jsp";
		
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
