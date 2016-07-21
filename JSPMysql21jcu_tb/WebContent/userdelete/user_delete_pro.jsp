<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import= "java.sql.*"%>
<%@ page import= "kr.or.ksmart.dto.User"%>
<%@ page import= "kr.or.ksmart.dao.Udao"%>
<jsp:useBean id="u" class="kr.or.ksmart.dto.User"/>
<jsp:setProperty name="u" property="*"/>

<%request.setCharacterEncoding("euc-kr");
	
	String uID = request.getParameter("u_id");
	System.out.print(uID+"<--uID");
	Udao dao =new Udao();
	dao.uDelete(u);

%>

	