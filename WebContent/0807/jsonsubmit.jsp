<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
	%>
	<h3>이름은 [ <%=name %> ]이고, 전화번호 는 [ <%=tel %> ]입니다.</h3>
</body>
</html>