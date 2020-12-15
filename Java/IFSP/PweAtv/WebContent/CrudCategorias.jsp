<%@page import="java.sql.ResultSet"%>
<%@page import="classes.Categorias"%>
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

	//Teste Insert
	Categorias categoria = new Categorias(0, "Eletrônicos");


	//categoria.save();
	
	//Teste Update
	
	categoria.setDescricao("Alimentos");
	
	ResultSet rs = categoria.select("descricao = '" + categoria.getDescricao() + "'");
	
	if(!rs.next()){
		out.println("erro resultSet");
	}
	
	int idCategoria = rs.getInt("idCategoria");
	
	categoria.setIdCategoria(idCategoria);
	
	
	
	
	categoria.save(); 
	
	//out.println(categoria.listAll());
	
	
	
	categoria.delete();

%>

</body>
</html>