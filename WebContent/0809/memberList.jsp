<%@ page import="kr.or.ddit.member.vo.MemberVO" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
         
<%
    List<MemberVO> list = (List<MemberVO>) request.getAttribute("list");
%>
[
	<%
	    for(int i = 0; i < list.size(); i++) { //for(MemberVo mem : list) {
	       MemberVO mem = list.get(i);
	        if(i > 0) out.print(",");
	%>
	
    <%-- for문 실행시마다 jsonobj를 생성 --%>
    {
        "name" : "<%=mem.getMem_name()%>",
        "id"   : "<%=mem.getMem_id()%>",
        "addr" : "<%=mem.getMem_add1() + mem.getMem_add2()%>",
        "hp"   : "<%=mem.getMem_hp()%>",
        "mail" : "<%=mem.getMem_mail()%>",
        "bir"  : "<%=mem.getMem_bir()%>",
        "zip"  : "<%=mem.getMem_zip()%>"
    }
	    
	<% } %>
]