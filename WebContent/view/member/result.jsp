<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h3>�޴�</h3>
   
   ${sessionScope.id }�� �α���
     <br>
   <a href="${pageContext.request.contextPath}/SearchController">����������</a><br>   
   <a href="${pageContext.request.contextPath}/LogoutController">�α׾ƿ�</a><br>
   <a href="${pageContext.request.contextPath}/DelController">Ż��</a><br>
   


<c:if test="${empty sessionScope.id }">
   <h3>�α��� ����</h3>
   <a href="${pageContext.request.contextPath}/view/member/loginForm.jsp">�α�����</a>
   </c:if>


</body>
</html>