<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品マスタ新規登</title>
</head>
<body>
	<h1>商品マスタ新規登録</h1>
	<div class="container">
		<div class="middle-div">
		<form action="InsertC" method="post" onsubmit="return checkAll()">
			<div class="div2">
				<div class="touroku-nav">ID</div>
				<div class="touroku-input">
					<input type="text" id="ID" name="ID">
				</div>
			</div>
			<div class="div2">
				<div class="touroku-nav">商品名</div>
				<div class="touroku-input">
					<input type="text" id="name" name="name">
				</div>
			</div>
			<div class="div2">
				<div class="touroku-nav">単価</div>
				<div class="touroku-input">
					<input type="text" id="tanka" name="tanka">
				</div>
			</div>
			<div class="touroku-btns">
				<div >
					<button type="submit" class="touroku-btn">登録</button>
				</div>
		</form>
		<div >
			<form action="HC">
				<button class="touroku-btn2">キャンセル</button>
			</form>
		</div>
		</div>
	</div>
	<h1 id="result">${result }</h1>
	</div>
</body>
</html>