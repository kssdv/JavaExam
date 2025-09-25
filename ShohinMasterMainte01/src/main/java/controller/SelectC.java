package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.ShohinDAO;

/**
 * サーブレット名：SelectC
 * 機能：商品マスタの該当レコードの選択後、商品マスタ詳細画面を表示する
 */
@WebServlet("/SelectC")
public class SelectC extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShohinDAO.getShohin(request);
		request.setAttribute("contentPage", "shousai.jsp");
		request.getRequestDispatcher("common.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
