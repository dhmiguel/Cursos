<%@page import="classes.Usuario"%>
<%@page import="multitools.RandomCode"%>
<%@page import="mail.SendMail"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	//faz a recepção de dados
    String email = request.getParameter("email");
	String cpf = request.getParameter("cpf");
	
	String 	senha = "";
	//int 	idNivelUsuario = 0; //por ser default no banco de dados
	/*String 	nome = request.getParameter("nome");
	String 	endereco = request.getParameter("endereco");
	String 	bairro = request.getParameter("bairro");
	String 	cidade = request.getParameter("cpf");
	String 	uf = request.getParameter("uf");
	String 	cep = request.getParameter("cep");
	String 	telefone = request.getParameter("telefone");
	String 	foto = request.getParameter("foto");
	String 	ativo = request.getParameter("ativo");
	*/

	if (email == null)
		email = "";
    
	Usuario user = new Usuario (0, email, senha , 1, "", cpf, "", "", "", "", "", "", "", "");
	senha = user.newPassword();
	user.setSenha(senha);
	user.save();

	// por onde eu vou mandar esse email
	String smtpHost = "smtp.gmail.com"; 
	String smtpPort = "587"; 
	String username = "pwediegomiguel@gmail.com";
	String password = "pweifsp@2020_2";
	String auth     = "tls";  
	SendMail sendMail =  new SendMail( smtpHost,  smtpPort,  username,  password,  auth  );
	
	// a mensagem do email e pra quem vou enviar
	
	String mailFrom 	= "gustavololtroll@gmail.com"; 
 	String mailTo 		= email; 
 	String mailSubject 	= "Sua senha e login Chegou!"; 
 	String mailBody 	= " Foi gerado para o sistema, com este usuário "+mailTo +
 						  " e senha "+ senha ; 
	sendMail.send( mailFrom, mailTo, mailSubject, mailBody );
	
	String messagem = "foi enviado para o email "+ mailTo + " a senha gerada automaticamente!";
	out.write(messagem);
	response.sendRedirect("home.html");

%>


</body>
</html>