<%@page import="br.com.fiap.repositorio.RepositorioProdutoStub.Produto"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Produtos</title>
</head>
<body>

	<h1>Lista de Produtos</h1>
	<%
		Produto[] produtos = (Produto[]) request.getAttribute("produtos");
	%>
	<h3>Cadastrar</h3>

	<form action="cadastra" method="post">
		<table>
			<tr>
				<td>Codigo</td>
				<td>Nome do produto</td>
				<td>Descrição</td>
				<td>Valor</td>
			</tr>
			<tr>
				<td><input type="text" name="codigo"
					placeholder="insira o código" required="required"></input></td>
				<td><input type="text" name="nome"
					placeholder="insira o nome do produto" required="required"></input></td>
				<td><input type="text" name="descricao"
					placeholder="insira a descricao" required="required"></input></td>
				<td><input type="text" name="valor"
					placeholder="insira a descricao" required="required"></input></td>
		</table>
		<input type="submit" value="cadastrar"></input>

	</form>
	<%
		if (produtos != null) {
	%>
	<table class="table">
		<tr>
			<th>Código</th>
			<th>Nome</th>
			<th>Descrição</th>
			<th>Valor</th>
		</tr>
		<%
			for (Produto produto : produtos) {
		%>
		<tr>
			<td><%=produto.getCodigo()%></td>
			<td><%=produto.getNome()%></td>
			<td><%=produto.getDescricao()%></td>
			<td><%=produto.getValor()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		} else {
	%>
	<h1>Nenhum produto cadastrado</h1>
	<%}%>


</body>
</html>