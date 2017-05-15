<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="paginaErro.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>P�gina Inicial</title>
</head>
<body>

	 <jsp:include page="cabecalho.jsp" />
	
	<div class="container">
		<h4>Seja Bem Vindo,</h4>
		<h5>Escolha alguma das opcoes:</h5>
		
		<label><a href="imc.jsp">Calcule seu IMC</a></label><br>
		<label><a href="mega">Sortei 6 Numeros</a></label><br>
		<label><a href="soma.jsp">Some dois Numeros</a></label><br>
	</div>
	
	
	 <jsp:include page="rodape.jsp" />
	 
</body>
</html>