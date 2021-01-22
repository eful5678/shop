<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<c:if test="${o_state==0 }">
<h3>�ֹ� ���</h3>
</c:if>
<c:if test="${o_state==1 }">
<h3>��ٱ��� ���</h3>
</c:if>

<table border="1">
<tr>
<th>�ֹ���ȣ</th><th>��ǰ��</th><th>����</th><th>�ֹ�����</th><th>�����ݾ�</th><th>�ֹ���</th>
</tr>
<c:forEach var="o" items="${list }">
<tr>
<td>${o.num }</td>
<td><a href="${pageContext.request.contextPath }/seller/detail?num=${o.pro_num }">${o.prod_name }</a></td>
<td><img src="${o.prod_img }" width="200" height="200"></td>
<td>${o.order_num }</td><td>${o.total_price }</td><td>${o.o_date }</td>
</tr>
</c:forEach>
</table>
</body>
</html>