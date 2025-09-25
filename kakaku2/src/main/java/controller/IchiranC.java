package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.ProductDAO;
import model.ProductDTO;

/**
 * Servlet implementation class IchiranC
 */
@WebServlet("/ichiran")
public class IchiranC extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public IchiranC() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. DAO インスタンス持ち込み
		ProductDAO dao = ProductDAO.getInstance();
		
		// 2. DAOの productList() メソッドを呼び全商品の目録読み込み
		List<ProductDTO> productList = dao.productList();
		
		// 3. request オブジェクトに商品目録を"productList"という名前で保存
//		request.setAttribute("productList", productList);
		request.setAttribute("list", productList);
		
		// 4. データが入った requestを ichiran.jspにフォワーディング
//	    request.getRequestDispatcher("/ichiran.jsp").forward(request, response);
	    RequestDispatcher rd = 
				request.getRequestDispatcher("/ichiran.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
