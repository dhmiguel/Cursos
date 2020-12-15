<%@page import="java.sql.ResultSet"%>
<%@page import="classes.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	
<script type ="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Página privada</title>
</head>
<body>

<%

	/*String user =  request.getParameter("user");
	String senha = request.getParameter("password");
	
	Usuario usuario = new Usuario(user, senha);
	
	ResultSet rs = usuario.select(user);
	
	String email = rs.getString("email");
	*/
	
	Usuario user = (Usuario)session.getAttribute("userlogin");
	
	if(user == null){
		out.println("Sessão inválida");
	}
	
	String email = user.getEmail();
	
	ResultSet rs = user.select("email = '" + email + "'");
	
	if(!rs.next()){
		out.println("erro resultSet");
	}
	
	String cpf = rs.getString("cpf");
	
	int idUsuario = rs.getInt("idUsuario");
	
		
%>

<h2>Atualize seus dados!</h2>

<form method="post" action="validaUpdate.jsp">

	Email: <input type="text" name="email" value="<%=email%>" class="ml-2"  disabled/> <br><br>
	CPF: <input type="text" name="email" value="<%=cpf%>" class="ml-2" disabled/> <br><br>

	Digite o nome: <input type="text" name="nome" class="ml-2" id="nome"><br><br>
		
	Digite o endereco: <input type="text" name="endereco" class="ml-2" id="endereco"><br><br>
		
	Digite o bairro: <input type="text" name="bairro" class="ml-2" id="bairro"><br><br>
		
	Digite o cidade: <input type="text" name="cidade" class="ml-2" id="cidade"><br><br>
		
	Digite o uf: <input type="text" name="uf" class="ml-2" id="uf"><br><br>
		
	Digite o cep: <input type="text" name="cep" class="ml-2" id="cep"><br><br>
		
	Digite o telefone: <input type="text" name="telefone" class="ml-2" id="telefone"><br><br>
	
	Foto: <input type="text" name="foto" class="ml-2" id="foto"><br><br>
	
	Ativo: <input type="text" name="ativo" class="ml-2" id="ativo"><br><br>
	
	<button id="btnAtualizar" class="ml-2">Atualizar dados</button><br><br>
		

</form>

<a class="btn btn-outline-danger ml-2" href="sair.jsp" role="button">Sair</a><br><br>

</body>
</html>