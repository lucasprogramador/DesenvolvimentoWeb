<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="x" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro - L10</title>
</head>
<body>

	<form action="adicionar" method="get">
		<x:form nome="Nome:" tipoForm="text" id="nome" />
		<x:form nome="Descricao:" tipoForm="text" id="descricao" />
		<x:form nome="Valor:" tipoForm="text" id="valor"></x:form>
		<input type="submit" value="adicionar">
	</form>
	
	<a href="index.jsp">  votar </a>
</body>
</html>