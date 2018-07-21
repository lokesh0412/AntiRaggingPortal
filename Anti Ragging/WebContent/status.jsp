<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Status</title>
<style>
#content {
	margin-left: 450px;
	margin-top: 250px;
	margin-bottom: 200px;
}
</style>
</head>
<body>
	<jsp:include page="navbarjsp.jsp" />
	<form action="StatusCheck" method="post">
		<div id="content">
			<div class="form-group" class="row">
				<div class="col-sm-4">
					<label>Complain ID</label> <input type="text" class="form-control" name="complainId"
						placeholder="complain id goes here..." /><br />
					<div class="col-sm-4">
						<input type="submit" value="check"
							class=" btn btn-primary btn-block">
					</div>
				</div>
			</div>
		</div>
	</form>
<table>
<thead>
<tr>
<td>ComplainId</td>
<td>Status</td>
<td>Message</td>
</tr>
</thead>
<tr>
<td>${param.complainId}</td>
<td>${param.status}</td>
<td>${param.message}</td>

</tr>
</table>
</body>
</html>