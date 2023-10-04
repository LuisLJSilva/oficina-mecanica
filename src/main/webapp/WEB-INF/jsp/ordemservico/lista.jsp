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
	  <h3>Listagem de Ordem de Serviço: ${listagem.size()}</h3>
	  <h4><a href="/ordemservico">Nova Ordem Serviço</a></h4>
	 
	  

	  <table class="table table-striped">
	    <thead>
	      <tr>
	      <th>ID</th>
	        <th>Status</th>
	        <th>Data Agendamento</th>
	        <th>Urgente</th>
	        <th>Cliente</th>
	        <th>Serviços</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	   	  
<c:forEach var="o" items="${listaOrdemServico}">
		      <tr>
		      	<td>${o.id}</td>
		        <td>${o.status}</td>
		        <td>${o.formattedDataAgendamento}</td>
		        <td>${o.urgente}</td>
		        <td>${o.cliente.nome}</td>
		        <td>${o.servicos.size()}</td>
		        <td><a href="/ordemservico/${o.id}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>