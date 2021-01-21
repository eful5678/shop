package product.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import product.service.Service;
import product.service.ServiceImpl;

/**
 * Servlet implementation class ProdDelController
 */
@WebServlet("/seller/Del")
public class ProdDelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdDelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 뭘 삭제할지 알기 위해 product.num 받아옴
		int num = Integer.parseInt(request.getParameter("num"));

		// 2. 삭제 기능 수행을 위해 service 가져옴
		Service service = new ServiceImpl();
		Product p = service.getProduct(num);
		String uploadPath = "D:\\shop2\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\img";
		String[] arr = p.getImg().split("/");
		String fname = arr[arr.length-1];
		File f = new File(uploadPath+fname);
		f.delete();
		service.delProduct(num);
		
		// 3. 삭제 이후 redirect
		response.sendRedirect("/shop2/seller/List");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
