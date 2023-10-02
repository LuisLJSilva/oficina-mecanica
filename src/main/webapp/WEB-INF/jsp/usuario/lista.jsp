<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>AppPedido</title>
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container-fluid mt-3">
	  <h3>Listagem de usuários:</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	     	<th>ID</th>
	        <th>Nome</th>
	        <th>E-mail</th>
	        <th>Senha</th>
	        <th>Clientes</th>
	        <th>Servicos</th>
	        <th>Ordem de Serviço</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	   	    
	      <c:forEach var="u" items="${listaUsuario}">
		      <tr>	
		      	<td>${u.id}</td>
		        <td>${u.nome}</td>
		        <td>${u.email}</td>
		        <td>${u.senha}</td>
		        <td>${u.clientes.size()}</td>
		        <td>${u.servicos.size()}</td>
		        <td>${u.ordemServico.size()}</td>
		        <td><a href="/usuario/${u.id}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>