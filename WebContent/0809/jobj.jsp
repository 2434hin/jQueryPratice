<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 클라이언트 요청 시 전송되는 데이터를 받아온다.
    	// DB를 이용하는 CRUD 처리를 한다.
    	// 처리 결과를 클라이언트로 응답한다.
    	// 응답타입은 json object로한다.
    %>
    
<%--     jsonobj 데이터  --%>
<%--     :) html 주석이 있으면 실행이 안된다. --%>
<%--     html 주석은 불가능 jsp주석문을 이용 --%>
    
    {
    	"name" : "홍길동",
    	"addr" : "대전 중구",
    	"tel" : "010-1234-5678"
    }