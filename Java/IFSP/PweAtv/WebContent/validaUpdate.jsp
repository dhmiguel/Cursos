<%@page import="java.sql.ResultSet"%>
<%@page import="classes.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String 	nome = request.getParameter("nome");
	String 	endereco = request.getParameter("endereco");
	String 	bairro = request.getParameter("bairro");
	String 	cidade = request.getParameter("cidade");
	String 	uf = request.getParameter("uf");
	String 	cep = request.getParameter("cep");
	String 	telefone = request.getParameter("telefone");
	String foto = request.getParameter("foto");
	String ativo = request.getParameter("ativo"); 
	
	Usuario user = (Usuario)session.getAttribute("userlogin");
	
	
	String email = user.getEmail();
	
	
	ResultSet rs = user.select("email = '" + email + "'");
	

	if (!rs.next()) {
		out.println("erro resultSet");
	}


	int idUsuario = rs.getInt("idUsuario");
	String cpf = rs.getString("cpf");

	user.setIdUsuario(idUsuario);
	user.setNome(nome);
	user.setEndereco(endereco);
	user.setBairro(bairro);
	user.setCidade(cidade);
	user.setUf(uf);
	user.setCep(cep);
	user.setTelefone(telefone);
	user.setFoto(foto);
	user.setAtivo(ativo);
	user.setCpf(cpf);
	user.setIdNivelUsuario(1);

	user.save();
	
	
%>

</body>
</html>