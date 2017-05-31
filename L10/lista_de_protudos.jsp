<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Produtos - L10</title>
</head>
<body>
	
	<table>
		<tr>
			<th>Nome</th>
			<th>Descrição</th>
			<th>Valor</th>
		</tr>
		<c:forEach items="${produtos}" var="produto">
			<tr>
				<td>${produto.nome}</td>
				<td>${produto.descricao}</td>
				<td>${produto.valor}</td>
				<td>	<a href="alterar_produto.jsp?id=${produto.id}">editar</a>	</td>
				<td>	<a href="deletar?id=${produto.id}">excluir</a>	</td>
			</tr>
		</c:forEach>
	</table>
	
	<h1>
		<a href="cadastro.jsp"> + </a>
	</h1>
	

</body>
</html>