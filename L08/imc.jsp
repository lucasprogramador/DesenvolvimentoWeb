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
		<p>Insira seus dados:</p>
	
		<form action="imc" method="post">
	
			<label>peso:</label> <input name="peso" type="text" value="1">
	
			<label>altura:</label> <input name="altura" type="text" value="1">
	
			<input type="submit" value="enviar">
	
		</form>
	
		<p>Resultado: ${resultado}</p>
		<br>
		<p>Situacao: ${situacao}</p>
	</div>
	

	<jsp:include page="rodape.jsp" />

</body>
</html>