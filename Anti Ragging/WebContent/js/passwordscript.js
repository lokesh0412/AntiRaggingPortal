$(document).ready(function(){
	$("#password").keyup(
			function(){
				var pass=$("#password").val();
				if(pass.length>8)
					$("#msg").html("strong");
				else
					$("#msg").html("weak");
			}
			);
});