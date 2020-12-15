<%@page import="classes.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta http-equiv="content-type"
	content="application/xhtml+xml; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String user = request.getParameter("user");
		String senha = request.getParameter("password");

		String saida = "";
	
		
		Usuario usuario = new Usuario(0, user, senha, "", "", "", "", "", "", "", "", "", "");
		if (usuario.checkLogin()) {
			session.setAttribute("userlogin", usuario);
			saida = "{ \"login\": \"true\" }";
			response.sendRedirect("privatePage.jsp");
			

		} else {
			session.setAttribute("userlogin", 0);
			saida = "{ \"login\": \"false\"}";
			out.write("Login invalido");
		}
		out.write(saida);
		
	%>

</body>
</html>