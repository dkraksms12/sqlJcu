<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.sql.DriverManager" %>
<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.PreparedStatement" %>
<%@ page import = "java.sql.SQLException" %>
<%@ page import ="kr.or.ksmart.driverdb.DriverDB"%>
<%@ page import ="kr.or.ksmart.dao.Mdao"%>

<%
String mId = request.getParameter("send_id");

request.setCharacterEncoding("euc-kr");

Connection conn = null;

DriverDB db = new DriverDB();
conn = db.driverDbcon();

Mdao dao = new Mdao();
dao.mDelete(mId, conn);

response.sendRedirect(request.getContextPath()+"/user/user_list.jsp");


%>