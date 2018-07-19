<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
%> --%>
<% 
HttpServletResponse httpResponse = (HttpServletResponse)response;
httpResponse.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); 
response.addHeader("Cache-Control", "post-check=0, pre-check=0");
httpResponse.setHeader("Pragma","no-cache"); 
httpResponse.setDateHeader ("Expires", 0); 
%>
<h1 style="text-align:center;color:red;">${requestScope.errMessage}</h1>
<a href="index.html">click here to go to home page</a>
</body>
</html>