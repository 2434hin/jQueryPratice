<%@page import="kr.or.ddit.lprod.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	List<LprodVO> list = (List<LprodVO>) request.getAttribute("list");
%>
[
	<%
	    for(int i = 0; i < list.size(); i++) { 
	    	LprodVO lprod = list.get(i);
	        if(i > 0) out.print(",");
	%>
	
    <%-- for문 실행시마다 jsonobj를 생성 --%>
    {
        "id" : "<%=lprod.getLprod_id()%>",
        "gu" : "<%=lprod.getLprod_gu()%>",
        "nm" : "<%=lprod.getLprod_nm()%>"

    }
	    
	<% } %>
]