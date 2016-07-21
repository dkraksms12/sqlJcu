<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="java.sql.*" %>
<%@ page import ="kr.or.ksmart.dto.Member"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

	Member m = new Member();
	m.setM_id("id001");
	m.setM_pw("pw001");
	m.setM_level("1");
	m.setM_name("전채은");
	m.setM_email("nolbuc");
	
	out.print(m.getM_id());
	out.print(m.getM_pw());
	out.print(m.getM_level());
	out.print(m.getM_name());
	out.print(m.getM_email());
	
	System.out.print(m);

%>
</body>
</html>