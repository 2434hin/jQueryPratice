<%@page import="kr.or.ddit.member.vo.ZipVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
[
    <%
    	List<ZipVO> list = (List<ZipVO>) request.getAttribute("list");

    	for(int i = 0; i < list.size(); i++){

    		ZipVO vo = list.get(i);

    		String sido = vo.getSido();
    		if(sido == null)
    			sido = "";

			if(i > 0)
				out.print(",");

	%>
		{
			"sido" : "<%=sido %>"
		}

	<%} %>

]