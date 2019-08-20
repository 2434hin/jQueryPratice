<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	String resid = (String) request.getAttribute("resId");
    	String inputid = (String) request.getAttribute("inputId");

//     	Map<String, String> m = (Map<String, String>) request.getAttribute("map");
//     	String resid = m.get("resId");
//     	String inputid = m.get("inputId");

		if(resid == null){	// 저장된 이름이 없다. - 사용가능
	%>
			{
				"res" : "<%=inputid %>는(은) 사용가능"
			}
	<%
		} else {	// 저장된 이름이 있다. - 사용불가
	%>
			{
				"res" : "<%=inputid %>는(은) 사용 불가능"
			}
	<%
		}
    %>
