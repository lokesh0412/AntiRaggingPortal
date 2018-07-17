<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
body {
    margin: 0;
}

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 25%;
    background-color: #f1f1f1;
    position: fixed;
    height: 100%;
    overflow: auto;
}

li a {
    display: block;
    color: #000;
    padding: 8px 10px;
    text-decoration: none;
}

li a.active {
    background-color: #4CAF50;
    color: white;
}

li a:hover:not(.active) {
    background-color: #555;
    color: white;
}
</style>
</head>
<body>
<% 
    if(session.getAttribute("username")==null)
    	response.sendRedirect("login.html");
	%>
<ul>
  <li><a href="ComplaintDetails.jsp" id="complaint">Add New Complain</a></li>
  <li><a href="#news">Status</a></li>
  <li><a href="LogoutServlet">Logout</a></li>
</ul>
<div id="result">
</div>
</body>
</html>