<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>jQuery UI Dialog - Default functionality</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<script src="jquery.js"></script>
<script src="matchPassword.js"></script>
<script src="passwordscript.js"></script>
<script>
	$(function() {
		$("#dialog").dialog();
	});
</script>

<style>
@import "font-awesome.min.css";

@import "font-awesome-ie7.min.css";
/* Space out content a bit */
body {
	padding-top: 20px;
	padding-bottom: 20px;
}

/* Everything but the jumbotron gets side spacing for mobile first views */
.header, .marketing, .footer {
	padding-right: 15px;
	padding-left: 15px;
}

/* Custom page header */
.header {
	border-bottom: 1px solid #e5e5e5;
}
/* Make the masthead heading the same height as the navigation */
.header h3 {
	padding-bottom: 19px;
	margin-top: 0;
	margin-bottom: 0;
	line-height: 40px;
}

/* Custom page footer */
.footer {
	padding-top: 19px;
	color: #777;
	border-top: 1px solid #e5e5e5;
}

/* Customize container */
@media ( min-width : 768px) {
	.container {
		max-width: 730px;
	}
}

.container-narrow>hr {
	margin: 30px 0;
}

/* Main marketing message and sign up button */
.jumbotron {
	text-align: center;
	border-bottom: 1px solid #e5e5e5;
}

.jumbotron .btn {
	padding: 14px 24px;
	font-size: 21px;
}

/* Supporting marketing content */
.marketing {
	margin: 40px 0;
}

.marketing p+h4 {
	margin-top: 28px;
}

/* Responsive: Portrait tablets and up */
@media screen and (min-width: 768px) {
	/* Remove the padding we set earlier */
	.header, .marketing, .footer {
		padding-right: 0;
		padding-left: 0;
	}
	/* Space out the masthead */
	.header {
		margin-bottom: 30px;
	}
	/* Remove the bottom border on the jumbotron for visual effect */
	.jumbotron {
		border-bottom: 0;
	}
}
</style>
</head>
<body class="text-center" style="background-color: #E3F79E">


	<form action="/action_page.php">
		<div class="container">
			<h1 class="well">Sign up</h1>
			<div class="col-lg-12 well">
				<div class="row">

					<div class="row">
						<div class="col-sm-6 form-group">
							<label for="fname">FirstName</label> <input type="text"
								class="form-control" id="fname" placeholder="Enter first name"
								required>
						</div>
						<div class="col-sm-6 form-group">
							<label for="lname">LastName</label> <input type="text"
								class="form-control" id="fname" placeholder="Enter last name"
								required>
						</div>
					</div>

					<div class="form-group">
						<label for="college">College Name</label> <input type="text"
							class="form-control" id="college"
							placeholder="Enter college name" required>
					</div>

					<div class="row">
						<div class="col-sm-6 form-group">
							<label for="college">DOB</label> <input type="date"
								class="form-control" id="dob" placeholder="Enter dob">
						</div>
						<div class="col-sm-6 form-group">
							<label class="control-label col-sm-2" for="course">Course</label>
							<select class="form-control" id="sel1">
								<option>B.Tech</option>
								<option>BCA</option>
								<option>M.Tech</option>
								<option>MCA</option>
							</select>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label for="address">Address</label> <input type="text"
						class="form-control" id="addres" placeholder="Enter address"
						required>
				</div>

				<div class="form-group">
					<label for="email">Email</label> <input type="email"
						class="form-control" id="email" placeholder="Enter email" required>
				</div>
				<div class="row">
					<div class="col-sm-6 form-group">
						<label for="password">Password</label> <input type="password"
							class="form-control" id="password" placeholder="Enter password"
							required>
						<div id="msg"></div>
					</div>

					<div class="col-sm-6 form-group">
						<label for="cnfpassword">Confirm Password</label> <input
							type="password" class="form-control" id="cnfpassword"
							placeholder="Confirm password" required> <span
							style="color: red; font-style: oblique; font-size: 80%;"
							id="message"></span>
					</div>
				</div>

				<button type="button" class="btn btn-lg btn-info">Submit</button>
			</div>
	</form>
	</div>


</body>
</html>