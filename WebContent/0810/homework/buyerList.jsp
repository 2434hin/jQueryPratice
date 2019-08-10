<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
 	List<Map> list = (List<Map>) request.getAttribute("list");   
%>

[
	<%
		for(int i = 0; i < list.size(); i++){
			
			if(i > 0) out.print(",");
		
	%>
	
	{
		"id" : "<%=list.get(i).get("BUYER_ID") %>",
		"name" : "<%=list.get(i).get("BUYER_NAME") %>",
		"bank" : "<%=list.get(i).get("BUYER_BANK") %>",
		"bankNo" : "<%=list.get(i).get("BUYER_BANKNO") %>",
		"bankName" : "<%=list.get(i).get("BUYER_BANKNAME") %>",
		"zip" : "<%=list.get(i).get("BUYER_ZIP") %>",
		"add" : "<%=list.get(i).get("BUYER_ADD1") %> + <%=list.get(i).get("BUYER_ADD2") %>",
		"comtel" : "<%=list.get(i).get("BUYER_COMTEL") %>",
		"fax" : "<%=list.get(i).get("BUYER_FAX") %>",
		"mail" : "<%=list.get(i).get("BUYER_MAIL") %>",
		"charger" : "<%=list.get(i).get("BUYER_CHARGER") %>",
		"telext" : "<%=list.get(i).get("BUYER_TELEXT") %>"
	}
	
	<%} %>
]