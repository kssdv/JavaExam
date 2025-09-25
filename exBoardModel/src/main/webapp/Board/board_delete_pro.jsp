<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.board.model.*" %>
<%
	//한글 인코딩 
	request.setCharacterEncoding("UTF-8");
	
	BoardDAO dao = BoardDAO.getInstance();
	
	/* BoardDTO dto = new BoardDTO();
	dto.setIdx(Integer.parseInt(request.getParameter("idx")));
	dto.setPass(request.getParameter("pass")); */
	
	int idx = Integer.parseInt(request.getParameter("idx"));
	String pass = request.getParameter("pass");
	
	int row = dao.boardDelete(idx, pass); 
	
	if(row==1) {
%> 
<script>
	//alert("삭제되었습니다.");
	/* 팝업창이기 때문에 기본 부모 페이지에서 board_list.jsp로 이동하게 한다. */
	opener.location.replace("board_list.jsp");
	self.close();
</script>		
<%
	}else {
%>
	<script>
		alert("비밀번호 불일치");
		history.back();
	</script>
<%
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <% if(row != 0) { %>
	<h1>게시글 등록 완료</h1>
	<% }else { %>
	<h1>게시글 등록 실패</h1>
	<% } %> --%>
</body>
</html>