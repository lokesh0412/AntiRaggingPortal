<%@page import="com.anti.ragging.MailAcknowledgement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Process</title>
</head>
<body>
<jsp:useBean id="udao" class="model.UserLoginDAO" scope="session" />
<%
String email=request.getParameter("email");
String pass=udao.findPasswordByEmailId(email);
if(pass!=null){
	MailAcknowledgement.sendMail(email, pass);
	%>
	<script type="text/javascript">
	alert("your password is sent to your emailId");
	</script>
	<% response.sendRedirect("login.jsp");%>
	<%
}
else{
	%>
	<script type="text/javascript">
	alert("email id may be wrong");
	</script>
	<% response.sendRedirect("login.jsp");%>
	<% 
}
%>
</body>
</html>
