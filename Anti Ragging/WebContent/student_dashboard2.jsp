<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>User Profile</title>
    <!--REQUIRED STYLE SHEETS-->
    <!-- BOOTSTRAP CORE STYLE CSS -->
   <!--  <link href="assets/css1/bootstrap.css" rel="stylesheet" />
    FONTAWESOME STYLE CSS
    <link href="assets/css1/font-awesome.min.css" rel="stylesheet" />
    CUSTOM STYLE CSS
    <link href="assets/css1/style.css" rel="stylesheet" />
    GOOGLE FONT
    <link href='http://fonts.googleapis.com/css?family=Ruluko' rel='stylesheet' type='text/css' />
    --> <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <!-- <style>
.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color:#404040;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    padding: 12px 16px;
    z-index: 1;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>
 -->    
</head>
<body>
<jsp:include page="navbarjsp.jsp" />
<!--Header section  -->
    <div class="container" id="home">
        <div class="row text-center ">
             <div class="col-md-3 head-main ">             
                            <i class="fa fa-home" style="color:#47d147"></i>
                         <h3>  <a href="student_dashboard2.html" style="color:#47d147">HOME</a></h3>
   
                 </div>
            <div class="col-md-3 head-main">
    
                          <i class="fa fa-edit" style="color:#47d147"></i>
                         <h3>  <a href="ComplaintDetails.jsp" style="color:#47d147">ADD COMPLAIN</a></h3>
       
                 </div>
             <div class="col-md-3 head-main">

                        <i class="fa fa-check" style="color:#47d147"></i>
                         <h3>  <a href="status.jsp" style="color:#47d147">STATUS</a></h3>
          
                 </div>
             <div class="col-md-3 head-main">
                   <i class="fa fa-comment" style="color:#47d147"></i>
                      <h3>  <a href="Feedback.jsp" style="color:#47d147">FEEDBACK</a></h3>
      
                 </div>
          </div>
    </div>
    <!--End Header section  -->



    <!--About Section-->
    <section class="for-full-back color-light " id="about">
        <div class="container">

            <div class="row text-center">
                <div class="col-md-8 col-md-offset-2">
                    <h1 style="color:#47d147">ABOUT PORTAL</h1>
                    <h4>
                        <strong>Ragging has ruined countless innocent lives and careers. In order to eradicate it, Hon’ble Supreme Court in Civil Appeal No. 887 of 2009, passed the judgement wherein guidelines were issued for setting up of a Central Crisis Hotline and Anti-Ragging database. 
                        </strong>
                    </h4>
                </div>

            </div>
            
    <!--footer Section -->
    <div class="for-full-back " id="footer">
        2018 www.yourdomain.com | All Right Reserved
         
    </div>
    </div>
    </section>
    <!--End footer Section -->
    <!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY  -->
<!--     <script src="assets/plugins1/jquery-1.10.2.js"></script>
    BOOTSTRAP CORE SCRIPT  
    <script src="assets/plugins1/bootstrap.js"></script>
    CUSTOM SCRIPTS
    <script src="assets/js1/custom.js"></script>
 -->
</body>
</html>
