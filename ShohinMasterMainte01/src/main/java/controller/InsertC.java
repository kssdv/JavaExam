package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.ShohinDAO;

/**
 * サーブレット名：InsertC
 * 機能：商品マスタ新規登録画面を表示する
 */
@WebServlet("/InsertC")
public class InsertC extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("contentPage", "touroku.jsp");
		request.getRequestDispatcher("common.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			if (ShohinDAO.checkID(request)) {
				request.setAttribute("result", "重複したIDです！");
				request.setAttribute("contentPage", "touroku.jsp");
				request.getRequestDispatcher("common.jsp").forward(request, response);
			} else {
				ShohinDAO.InsertShohin(request);
				ShohinDAO.getAllShohin(request);
				request.setAttribute("contentPage", "ichiran.jsp");
				request.getRequestDispatcher("common.jsp").forward(request, response);
			}
	}

}
