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
<body class="text-center" style = "background-color : #E3F79E">
<jsp:include page="navbarjsp.jsp" />
	<div class="container">
		<h1 class="well">FEEDBACK</h1>
		<div class="col-lg-12 well">
			<div class="row">
				<form action="FeedbackServlet" method="post">
					<div class="col-sm-12">
						<div class="form-group">
							<label>Name</label>
							<input type="text" id="name" name="name" placeholder="Enter Name Here.." class="form-control"></textarea>
						</div>
						
						<div class = "row">
						<div class="col-sm-6 form-group">
							<label>Phone Number</label> <input type="Number" id="phoneNo" name="phoneNo"
								placeholder="Enter Phone Number Here.." class="form-control">
						</div>
						<div class="col-sm-6 form-group">
							<label>Email Address</label> <input type="email" id="email" name="email"
								placeholder="Enter Email Address Here.." class="form-control">
						</div>
						</div>
						
						<div class="row">
							<div class="col-sm-4 form-group">
								<label>Address</label> <input type="text" id="address" name="address"
									placeholder="Enter Address Name Here.." class="form-control">
							</div>
							<div class="col-sm-4 form-group">
								<label>State</label> <input type="text" id="state" name="state"
									placeholder="Enter State Name Here.." class="form-control">
							</div>
							<div class="col-sm-4 form-group">
								<label>Pin code</label> <input type="number" id="pincode" name="pincode"
									placeholder="Enter Pin Code Here.." class="form-control">
							</div>
						</div>
						
				     	
						<div class="form-group">
							<label>Feedback</label>
							<textarea placeholder="Enter Feedback Here.." rows="3" id="feedback" name="feedback"
								class="form-control"></textarea>
						</div>
						<button type="submit" class="btn btn-lg btn-info">Submit</button>
					</div>
				</form>
			</div>
		</div>
	</div>


</body>
</html>