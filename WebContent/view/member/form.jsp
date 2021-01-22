<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Form</title>

</head>
<body>
<form method="POST" action="${pageContext.request.contextPath }/JoinController">
	<table border="1">
		<tr>
			<th>ID</th>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<th>PWD</th>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<th>Name</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>Email</th>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<th>Address</th>
			<td><input type="text" name="address"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="radio" name="type" value="1">구매자
				<input type="radio" name="type" value="2">판매자
			</td>
			
		</tr>
		<tr>
			<td colspan="2"><input type="submit">
			<input type="reset">
			</td>
			
		</tr>
	</table>
</form>
</html>