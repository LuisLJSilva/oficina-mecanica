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
	  <h3>Listagem de Serviços:</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	     	<th>ID</th>
	        <th>Tipo Serviço</th>
	        <th>Preço</th>
	        <th>Código do Serviço</th>
	        <th>Ordem Servico</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	   	    
	      <c:forEach var="s" items="${listaServico}">
		      <tr>
		      	<td>${s.id}</td>
		        <td>${s.tipoServico}</td>
		        <td>${s.preco}</td>
		        <td>${s.codigoServico}</td>
		        <td>${s.ordemServico.size()}</td>
		        <td><a href="/servico/${s.id}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>