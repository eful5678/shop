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

<h3>메뉴</h3>
   
   ${sessionScope.id }님 로그인
     <br>
   <a href="${pageContext.request.contextPath}/SearchController">내정보수정</a><br>   
   <a href="${pageContext.request.contextPath}/LogoutController">로그아웃</a><br>
   <a href="${pageContext.request.contextPath}/DelController">탈퇴</a><br>
   


<c:if test="${empty sessionScope.id }">
   <h3>로그인 실패</h3>
   <a href="${pageContext.request.contextPath}/view/member/loginForm.jsp">로그인폼</a>
   </c:if>


</body>
</html>