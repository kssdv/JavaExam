<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!--<%@ page language="java" contentType="text/html; charset=UTF-8"%>-->
<!--    pageEncoding="UTF-8"%>-->
<%-- JSTL을 사용하기 위한 태그 라이브러리 지시어 --%>
<!--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ichiran</title>
</head>
<body>
	<header>
		<h1>Ichiran Page</h1>
	</header>
	
	<main>
		<input type="text"> <button>検索</button>
		<br/>
		<table border="1">
			<thead>
				<tr>
					<th>ストア</th>
					<th>商品名</th>
					<th>価格</th>
				</tr>
			</thead>
			<tbody>
                <%-- Controller가 넘겨준 "list"를 JSTL로 받아서 반복 처리 --%>
                <c:forEach var="dto" items="${list}">
                    <tr>
                        <td>${dto.store_name}</td>
                        <td>${dto.name}</td>
                        <%-- EL에서는 자동으로 형변환이 일어나므로 (int) 캐스팅이 필요 없습니다. --%>
                        <td>${dto.price}</td> 
                    </tr>
                </c:forEach>
                
                <%-- 만약 목록이 비어있을 경우 메시지 출력 --%>
                <c:if test="${empty list}">
                    <tr>
                        <td colspan="3" align="center">표시할 상품이 없습니다.</td>
                    </tr>
                </c:if>
			</tbody>
		</table>
	</main>
	
	<footer>
		
	</footer>
</body>
</html>