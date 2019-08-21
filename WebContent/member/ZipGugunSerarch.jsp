<%@page import="kr.or.ddit.member.vo.ZipVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	List<ZipVO> list = (List<ZipVO>) request.getAttribute("list");

    	if(list != null && list.size() > 0){
    		// 데이터가 있는 경우 jsonobj배열을 생성
    %>
    		{
    			"sw" : "OK",
    			"data" : [
	    			<%
						for(int i = 0; i < list.size(); i++){

							ZipVO vo = list.get(i);

							if(i > 0)
								out.print(",");
	    			%>
	    					{
								"gugun" : "<%=vo.getGugun() %>"
	    					}
	    			<%} %>
    			]
    		}

    <%
    	} else {
    		// 데이터 없는 경우
    %>
    		{
    			"sw" : "NO"
    		}
    <%
    	}
    %>