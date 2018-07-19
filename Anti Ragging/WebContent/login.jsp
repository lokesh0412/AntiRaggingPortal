<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!-- Script for clearing login failure message -->
	<script>
	$(document).ready(function(){
		$("#login-username").focus(function(){
			$("#msgFail").html("");
		});
		$("#login-password").focus(function(){
			$("#msgFail").html("");
		});
	});
	</script>
</head>
<body>
	<jsp:include page="index.html"></jsp:include>
	<div class="container">
		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog ">

				<!-- Modal content-->
				<div class="container">
					<div id="loginbox" style="margin-top: 50px;"
						class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
						<div class="panel panel-info">
							<div class="panel-heading">
								<div class="panel-title">Sign In</div>
								<div
									style="float: right; font-size: 80%; position: relative; top: -10px">
									<a href="#">Forgot password?</a>
								</div>
							</div>
							<div style="padding-top: 30px" class="panel-body">
								<div style="display: none" id="login-alert"
									class="alert alert-danger col-sm-12"></div>
								<form id="loginform" class="form-horizontal" role="form"
									method="post" action="LoginServlet">
									<div style="margin-bottom: 25px" class="input-group">
										<span class="input-group-addon"><i
											class="glyphicon glyphicon-user"></i></span> <input
											id="login-username" type="text" class="form-control"
											name="userName" value="" placeholder="username or email">
									</div>
									<div style="margin-bottom: 25px" class="input-group">
										<span class="input-group-addon"><i
											class="glyphicon glyphicon-lock"></i></span> <input
											id="login-password" type="password" class="form-control"
											name="password" placeholder="password">
									</div>
									<div>
										<span id="msgFail" style = "color : red;">
											<%
												if (request.getAttribute("loginFail") != null) {
													out.print(request.getAttribute("loginFail"));
												}
											%>
										</span>
									</div>
									<div class="input-group">
										<div class="checkbox">
											<label> <input id="login-remember" type="checkbox"
												name="remember" value="1"> Remember me
											</label>
										</div>
									</div>
									<div style="margin-top: 10px" class="form-group">
										<!-- Button -->
										<div class="col-sm-12 controls">
											<!-- <a id="btn-login" href="#" class="btn btn-success">Login
											</a> <a id="btn-fblogin" href="#" class="btn btn-primary">Login
												with Facebook</a> -->
											<button class="btn btn-primary" type="submit">Login</button>
										</div>
									</div>
									<div class="form-group">
										<div class="col-md-12 control">
											<div
												style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">
												Don't have an account! <a href="signup.jsp"
													onClick="$('#loginbox').hide(); $('#signupbox').show()">
													Sign Up Here </a>
											</div>
										</div>
									</div>
								</form>

							</div>
						</div>
					</div>
				</div>

			</div>
		</div>

	</div>

	<script>
		$(document).ready(function() {
			$("#myModal").modal();
		});
	</script>

</body>
</html>
