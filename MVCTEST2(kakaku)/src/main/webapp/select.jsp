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

            <audio src="audio/地上の星.m4a" controls></audio>
 
 			<h2>お勧めのIT書籍</h2>

			<table class="select-list">
			<tr>
				<th></th><th>書籍ID</th><th>書籍名</th><th>価格</th>
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

            <br/> 
            <img src="images/jobs.png" alt="ジョブス”width="300" height="200">
            <br/><br/> 
            <iframe width="500"height="300"src="https://www.youtube.com/embed/sG9ll81yvdI"title="Japan"></iframe>
 
	<%
		}
	%>

</body>
</html>