<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page errorPage="paginaErro.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculo do IMC</title>
</head>

<body>

	<jsp:include page="cabecalho.jsp" />

	<div class="container">
		<h4>Escolha dois numeros</h4>

		<form method="post">
			<label>Numero 01:</label> <input name="numero01" type="text" value="0">
			<label>Numero 02:</label> <input name="numero02" type="text" value="0">
			<input type="submit" value="enviar">
		</form>
		<br>
		<label>Resultado: ${param.numero01 + param.numero02}</label>
	</div>
	

	<jsp:include page="rodape.jsp" />
</body>

</html>