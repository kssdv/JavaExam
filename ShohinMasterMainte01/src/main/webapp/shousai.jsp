<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品マスタ詳細</title>
</head>
<body>
	<h1>商品マスタ詳細</h1>
	<div class="container">
		<div div class="middle-div">
			<form action="UpdateC" onsubmit="return checkAll()">
				<input type="text" id="ID" name="ID" value="${shohin.id }"
					hidden="hidden">
				<div class="div2">
					<div class="nav">ID</div>
					<div class="input">${shohin.id }</div>
				</div>
				<div class="div2">
					<div class="nav">商品名</div>
					<div class="input">
						<input type="text" id="name" name="name"
							value="${shohin.shohin_name }">
					</div>
				</div>
				<div class="div2">
					<div class="nav">単価</div>
					<div class="input">
						<input type="text" id="tanka" name="tanka"
							value="<fmt:formatNumber type="number" pattern="####.##"> ${shohin.tanka }
						</fmt:formatNumber>">
					</div>
				</div>
				<div class="btns">
					<div>
						<button type="button" class="btn"
							onclick="location.href='DeleteC?ID=${shohin.id }'">削除</button>
					</div>
					<div>
						<button class="btn2">修正</button>
					</div>
			</form>
			<form action="HC">
				<div>
					<button class="btn">キャンセル</button>
				</div>
			</form>
		</div>
	</div>
	</div>
</body>
</html>