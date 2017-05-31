<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="x" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Página Inicial</title>
<link rel="stylesheet" type="text/css" href="css/estilo.css">
</head>
<body>
	
	<x:cabecalho />
	<h5>Seja Bem Vindo</h5>
	
	<h5 class="texto-center">Índice de Massa Corporea</h5>
	<div>
		<form action="imc">
			<x:form id="altura"/>
			<x:form id="peso"/>
			<input type="submit" value="calcular">
		</form>
		<label>Resultado: ${resultado}</label>
		<label>Situação: ${situacao}</label>
	</div>	
	
	<h5 class="texto-center">Somar Dois Números</h5>
	<div>
		<form action="soma">
			<x:form id="A"/>
			<x:form id="B"/>
			<input type="submit" value="somar">
		</form>
		<label> Resultado: ${soma}</label>
	</div>
	
	<h5 class="texto-center">Loteria</h5>
	<div>
		<form action="loteria">
			<button type="submit">Sortea</button>
			<h5>Numeros ${numeros}</h5>
		</form>
	</div>
	
	<x:rodape/>
	
	<script type="text/javascript" src="js/jquery.min.js"></script>
</body>
</html>