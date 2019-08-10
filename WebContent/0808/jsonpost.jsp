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
		//post 방식
		request.setCharacterEncoding("UTF-8");
	
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
	%>
	
	<%=name %>님!! 환영합니다.<br>
	<%=tel %>번호로 연락드리겠습니다.<br>
	<h3>즐거운 하루 되세요~~</h3>
</body>
</html>