<%@page import="java.sql.ResultSet"%>
<%@page import="classes.Institucional"%>
<%@ page language="java" contentType="text/html; charset=UTF-8	"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	Institucional inst = new Institucional(0, "testeNome", "12345678944", 'f', "Rua teste", "testeBairro", "testeCidade", "uf", "07145632", "01174748545","testeEmail", "testeLogo");

	//Insert
	//inst.save();
	
	inst.setNome("testeNome2");
	
	//Update
	ResultSet rs = inst.select("nome = '" + inst.getNome() + "'");
	
	if(!rs.next()){
		out.println("erro resultSet");
	}
	
	int idInstituicao = rs.getInt("idInstituicao");
	inst.setIdInstituicao(idInstituicao);
	
	
	inst.setCidade("Guarulhos");
	
	inst.save();
	
	out.println(inst.listAll());
	
	inst.delete();
	
%>

</body>
</html>