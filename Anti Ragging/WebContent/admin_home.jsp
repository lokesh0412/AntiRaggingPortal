<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap-4.1.1-dist/css/bootstrap.min.css">
<script src="bootstrap-4.1.1-dist/js/bootstrap.min.js" ></script>

</head>
<body>
 <%HttpServletResponse httpResponse = (HttpServletResponse)response;

httpResponse.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); 
response.addHeader("Cache-Control", "post-check=0, pre-check=0");
httpResponse.setHeader("Pragma","no-cache"); 
httpResponse.setDateHeader ("Expires", 0); 
if (session.getAttribute("username") == null || session.getAttribute("password") == null ) {                               
                 response.sendRedirect("invalidSession.jsp");
                 return;
 } %> 
   <nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
      <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Company name</a>
      <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search">
      <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
        <a class="nav-link" href="#">Complains</a>
          <a class="nav-link" href="LogoutServlet">Sign out</a>
        </li>
      </ul>
    </nav>
</body>
</html>