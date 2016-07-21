<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
회원 리스트 <br>
<table width="100%" border="1">
<tr>
	<td>이름</td><td>아이디</td><td>권한</td><td>이름</td><td>이메일</td><td>전화번호</td><td>주소</td><td>수정</td><td>삭제</td>
</tr>
<%
request.setCharacterEncoding("euc-kr");

String id = request.getParameter("id");
String pw = request.getParameter("pw");
String level = request.getParameter("level");
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String addr = request.getParameter("addr");

System.out.print(id);

PreparedStatement pstmt = null;
Connection conn = null;
ResultSet rs = null;
Class.forName("com.mysql.jdbc.Driver");

try{
	String url="jdbc:mysql://localhost:3306/db01jcu?" +
			"useUnicod=true&characterEncoding=euckr";
	String user="dbid01jcu";
	String pass="dbpw01jcu";
	
	conn = DriverManager.getConnection(url, user, pass);
	String sql = "select * from tb_user";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
	while(rs.next()){
		%><tr>
			<td><%= rs.getString("u_id")%></td>
			<td><%= rs.getString("u_pw")%></td>
			<td><%= rs.getString("u_level")%></td>
			<td><%= rs.getString("u_name")%></td>
			<td><%= rs.getString("u_email")%></td>
			<td><%= rs.getString("u_phone")%></td>
			<td><%= rs.getString("u_addr")%></td>
			<td>
<a href="<%= request.getContextPath() %>/userupdate/user_update_form.jsp?send_id=<%= rs.getString("u_id")%>">수정클릭</a>			
			</td>
			<td>
<a href="<%= request.getContextPath() %>/userdelete/user_delete_pro.jsp?send_id=<%= rs.getString("u_id")%>">삭제클릭</a>			
			</td>
			
		</tr>
	<% }

}finally{
	if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	if (conn != null) try { conn.close(); } catch(SQLException ex) {}

}

%>
</table>
</body>
</html>
