// Ichiran.java
package com.kkk.kakaku.controller;

import java.io.IOException;
import java.util.List; // List import 추가

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.kkk.kakaku.model.ProductDAO; // ProductDAO import 추가
import com.kkk.kakaku.model.ProductDTO; // ProductDTO import 추가

/**
 * Servlet implementation class ichiran
 */
@WebServlet("/ichiran")
public class IchiranC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IchiranC() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. DAO 인스턴스 가져오기
		ProductDAO dao = ProductDAO.getInstance();
		
		// 2. DAO의 productList() 메소드를 호출하여 전체 상품 목록 가져오기
		List<ProductDTO> productList = dao.productList();
		
		// 3. request 객체에 상품 목록을 "productList"라는 이름으로 담기
//		request.setAttribute("productList", productList);
		request.setAttribute("list", productList);
		
		// 4. 데이터를 담은 request를 ichiran.jsp로 포워딩
//	    request.getRequestDispatcher("/ichiran.jsp").forward(request, response);
	    RequestDispatcher rd = 
				request.getRequestDispatcher("/ichiran.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}