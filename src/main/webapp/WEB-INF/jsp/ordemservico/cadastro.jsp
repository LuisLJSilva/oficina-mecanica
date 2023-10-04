<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Cadastro de Ordem de Serviço</title>
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>
	
	<div class="container mt-3">
	  <form action="/ordemservico/incluir" method="post">
	  <c:import url="/WEB-INF/jsp/servico/cadastro.jsp"/>

	    <div class="mb-3">
	      <label for="status">Status:</label>
	      <input type="text" class="form-control" placeholder="Entre com status" name="status">
	    </div>

	    <div class="mb-3">
	      <label for="dataAgendamento">Data Agendamento:</label>
	      <input type="datetime-local" class="form-control" name="formattedDataAgendamento">
	    </div>
	    
	    <div class="mb-3">
	      <label>Urgente:</label>
	      <div class="form-check">
	        <input type="radio" class="form-check-input" name="urgente" value="true"> Urgente
	      </div>
	      <div class="form-check">
	        <input type="radio" class="form-check-input" name="urgente" value="false"> Não Urgente
	      </div>
	    </div>
	    
	    <div class="mb-3">
	      <label>Cliente:</label>
	      <select name="cliente" class="form-control">
	      	<c:forEach var="c" items="${clientes}">
	      		<option value="${c.id}">${c.nome}</option>
	      	</c:forEach>
	      </select>
	    </div>
	    
	    <div class="mb-3">
	      <label>Serviços:</label>
	      	<c:forEach var="s" items="${servicos}">
				<div class="form-check">
				  <input class="form-check-input" type="checkbox" name="servicos" value="${s.id}">
				  <label class="form-check-label"> ${s.tipoServico}</label>
				</div>	   
			</c:forEach>
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>