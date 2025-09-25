<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Store" %>
<%@ page import="model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品選択</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%@include file = "header-navi.jsp"%>

	<%
		List<Product> listProd;
		Store store = (Store) session.getAttribute("store");
		if (store == null) {
			listProd = new ArrayList<Product>();
		} else {
			listProd = store.getListProd();
		}
		if (listProd.size() > 0) {
	%>

			<h2>商品選択</h2>

			<table class="select-list">
			<tr>
				<th></th><th>商品ID</th><th>商品名</th><th>価格</th>
			</tr>
				
	<%
			for (int idx = 0; idx < listProd.size(); idx++) {
				Product prod = listProd.get(idx);
	%>
				<tr>
					<td>
						<form action="add-prod-servlet" method="POST">
							<input type="hidden" name="idx" value="<%=idx%>">
							<input type="submit" value="選択">
						</form>
					</td>
					<td><%=prod.getId() %></td>
					<td><%=prod.getName() %></td>
					<td><%=prod.getPriceString() %></td>
				</tr>			
	<%
			}
	%>
			</table>
			<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d105003.68243298313!2d135.34011294895336!3d34.670734428251784!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x6000e8c4a39a2921%3A0x65bc306e908025bd!2z5aSn6Ziq5bqc5aSn6Ziq5biC5q2k6Iqx5Yy6!5e0!3m2!1sja!2sjp!4v1753253200039!5m2!1sja!2sjp" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
			

	<%
		}
	%>

</body>
</html>