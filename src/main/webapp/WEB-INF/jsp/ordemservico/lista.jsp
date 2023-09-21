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
	  <h3>Listagem de Ordem de Serviço:</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
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
		        <td>${o.status}</td>
		        <td>${o.dataAgendamento}</td>
		        <td>${o.urgente}</td>
		        <td>${o.cliente}</td>
		        <td>${o.servicos}</td>
		        <td><a href="/ordemservico/${o.status}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>