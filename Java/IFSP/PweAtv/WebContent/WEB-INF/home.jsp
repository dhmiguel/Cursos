<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta http-equiv="content-type"
	content="application/xhtml+xml; charset=UTF-8">
<title>Home | PWE</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	
<script type ="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<style>
main h3 {
	margin: 15px;
}
</style>


<body>

	<main>
		<h3>Faça seu login!</h3>
	</main>


	<form id="frmLogin" class="form-horizontal mt-5 ml-4">
		Usuario: <input class="form-control" type="text" name="user" id="user"
			value="" placeholder="Usuario"> <br> Senha: <input
			class="form-control" type="password" name="password" id="password"
			value="" placeholder="Senha"> <br>

		<button class="btn btn-primary" id="btnSendFrmLogin">Enviar</button>

		<a class="btn btn-primary" href="cadastro.html" role="button">Não
			possui login? Clique aqui</a>

	</form>

 
	<script type="text/javascript">
	$(document).ready( 
			function() {
				$("#btnSendFrmLogin").click(
						function() {
							
							var formData = $("#frmLogin").serialize();
							$.post( "validaLogin.jsp", formData, function( data, status  ) {
									var objReturn = $.parseJSON( data );
									if ( objReturn.login == "true" ){
										window.location.replace("privatePage.jsp");
									}else{
										alert("Login invalido");
									}
								}
							);	
						}		
					);
			} 
		);
	</script>
	
	
</body>
</html>