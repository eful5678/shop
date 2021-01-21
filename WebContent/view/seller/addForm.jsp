<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>상품 등록</h3>
<form action="${pageContext.request.contextPath }/seller/Add" method="get" enctype="multipart/form-data">
<table border="1">
<tr>
<td>상품명</td><td><input type="text" name="name"></td> 
</tr> 
<tr>
<td>수량</td><td><input type="text" name="quantity"></td> 
</tr>
<tr>
<td>가격</td><td><input type="text" name="price"></td> 
</tr>  
<tr>
<td>상품이미지등록</td><td><input type="file" name="img"></td> 
</tr>
<tr>
<td>상세설명</td>
<td><textarea rows="10" cols="25" name="content"></textarea></td> 
</tr> 
<tr>
<td colspan="2"><input type="submit" value="등록"></td>
</tr>
</table>
</form>
</body> 
</html>
