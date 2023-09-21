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
	  <h3>Listagem de Manutenção:</h3>
	  <h5><a href="/manutencao/cadastro">Incluir Manutenção</a></h5>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th>Tipo de Serviço</th>
	      	<th>Preço</th>
	      	<th>Codigo do Serviço</th>
	        <th>Necessita de Peça</th>
	        <th>Tempo de Trabalho</th>
	        <th>Tipo de Manutenção</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	   	  
<c:forEach var="m" items="${listaManutencao}">
		      <tr>
		      	<td>${m.tipoServico}</td>
		      	<td>${m.preco}</td>
		      	<td>${m.codigoServico}</td>
		        <td>${m.necessitaPeca}</td>
		        <td>${m.tempoTrabalho}</td>
		        <td>${m.tipoManutencao}</td>
		        <td><a href="/manutencao/${m.tipoManutencao}/excluir">excluir</a> </td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>