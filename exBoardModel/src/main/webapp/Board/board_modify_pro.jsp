<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.board.model.*" %>
<%
	//한글 인코딩 
	request.setCharacterEncoding("UTF-8");
	
	BoardDAO dao = BoardDAO.getInstance();
	BoardDTO dto = new BoardDTO();
	/* dto.setName(request.getParameter("name")); */
	dto.setIdx(Integer.parseInt(request.getParameter("idx")));
	dto.setEmail(request.getParameter("email"));
	dto.setSubject(request.getParameter("subject"));
	dto.setContents(request.getParameter("contents"));
	dto.setPass(request.getParameter("pass"));
	
	int row = dao.boardModify(dto);
	
	if(row==1) {
		//response는 jsp의 메소드, board_list.jsp로 이동
		//jsp의 내강객체 (new를 이용해서 객체를 생성할 필요 없다.) request, response, out이 있다.
		response.sendRedirect("board_list.jsp");
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