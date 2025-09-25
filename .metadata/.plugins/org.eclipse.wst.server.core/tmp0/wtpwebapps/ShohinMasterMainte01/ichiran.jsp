<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品マスタ一覧</title>
</head>
<body>
	<div class="ichiran-nav">
		<h1>商品マスタ一覧</h1>
		<form action="InsertC">
			<button class="insert-btn">新規登録</button>
		</form>
	</div>
	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>商品名</td>
				<td>単価</td>
				<td>登録日時</td>
				<td>更新日時</td>
				<td>詳細</td>

			</tr>
		</thead>
		<c:forEach var="s" items="${Shohins}">
			<tbody>
				<tr>
					<td>${s.id }</td>
					<td>${s.shohin_name }</td>
					<td class="ichiran-tanka"><fmt:formatNumber type="number"
							value="${s.tanka }">
						</fmt:formatNumber></td>
					<td><fmt:formatDate value="${s.createdate }" type="DATE"
							pattern="yyyy/MM/dd HH:mm:ss" /></td>
					<td><fmt:formatDate value="${s.updatedate }" type="DATE"
							pattern="yyyy/MM/dd HH:mm:ss" /></td>
					<td>
						<button onclick="location.href='SelectC?search=${s.id }'">詳細</button>
					</td
				</tr>
			</tbody>
		</c:forEach>
	</table>
</body>
</html>