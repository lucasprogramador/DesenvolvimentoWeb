<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page errorPage="paginaErro.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sorteado...</title>
</head>
<body>

	<jsp:include page="cabecalho.jsp" />

	<div class="container">
		<p>Seus numeros sorteados</p>
		<h4>${numeros}</h4>
	</div>
	
	<jsp:include page="rodape.jsp" />
</body>
</html>