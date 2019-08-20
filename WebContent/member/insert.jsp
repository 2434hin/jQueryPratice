<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    String id = (String)request.getAttribute("mid");
    if(id != null){
    %>
    {

       "res" : "<%= id %>저장 성공"

    }

    <%}else { %>

   {
      "res" : "저장 실패"

   }

    <%
    }
    %>