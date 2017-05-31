<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="x" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Produto - L10</title>
</head>
<body>
	
	<form action="alterar-produto" method="get">
		<input id="id-x" name="id-x" type="text" value="${param.id}" hidden="true">
		<x:form nome="Novo Nome:" tipoForm="text" id="novo-nome"/>
		<x:form nome="Nova Descrição:" tipoForm="text" id="nova-descricao"/>
		<x:form nome="Novo Valor:" tipoForm="text" id="novo-valor"/>
		<input type="submit" value="atualizar">
	</form>
	
	<a href="listar"> voltar </a>
</body>
</html>