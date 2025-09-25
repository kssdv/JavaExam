package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.ShohinDAO;

/**
 * サーブレット名：UpdateC
 * 機能：商品マスタの該当レコードを修正し、商品マスタ一覧画面に戻る
 */
@WebServlet("/UpdateC")
public class UpdateC extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ShohinDAO.UpadteShohin(request);	 
	ShohinDAO.getAllShohin(request);
	request.setAttribute("contentPage", "ichiran.jsp");
	request.getRequestDispatcher("common.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
