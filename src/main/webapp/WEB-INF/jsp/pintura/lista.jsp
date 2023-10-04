<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Oficina Mecânica</title>
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container-fluid mt-3">
	  <h3>Listagem de Pintura:</h3>
	  <h5><a href="/pintura/cadastro">Incluir Pintura</a></h5>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>ID</th>
	      	<th>Tipo de Serviço</th>
	      	<th>Preço</th>
	      	<th>Codigo do Serviço</th>
	        <th>Intensidade de Brilho</th>
	        <th>Tinta Ecológica</th>
	        <th>Cor</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	   	  
<c:forEach var="p" items="${listaPintura}">
		      <tr>
		      	<td>${p.id}</td>
		      	<td>${p.tipoServico}</td>
		      	<td>${p.preco}</td>
		      	<td>${p.codigoServico}</td>
		        <td>${p.intensidadeBrilho}</td>
		        <td>${p.tintaEcologica}</td>
		        <td>${p.cor}</td>
		        <td><a href="/pintura/${p.id}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>