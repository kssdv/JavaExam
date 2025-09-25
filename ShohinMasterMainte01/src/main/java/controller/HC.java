package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.ShohinDAO;

/**
 * サーブレット名：HC(Home Controller)
 * 機能：商品マスタの全てのレコードを取得後、商品マスタ一覧画面を表示する
 */
@WebServlet("/HC")
public class HC extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ShohinDAO.getAllShohin(request);
	request.setAttribute("contentPage", "ichiran.jsp");
	request.getRequestDispatcher("common.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
