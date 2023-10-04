<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Oficina Mecânica</title>
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
	  <h2>Inclusão de Serviço - Manutenção </h2>
	  
	  <form action="/manutencao/incluir" method="post">
	  
	  <c:import url="/WEB-INF/jsp/servico/cadastro.jsp"/>
	    
	    <div class="mb-3">
	      <label for="freiosVerificados">Necessita Peça:</label>
	      <input type="checkbox" class="form-check-input" id="necessitaPeca" name="necessitaPeca">
	    </div>
	    
	    <div class="mb-3">
	      <label for="ajusteCambagem">Tempo de Trabalho:</label>
	      <input type="number" step="0.01" class="form-control" value="2.0" id="tempoTrabalho" placeholder="Entre com o tempo de trabalho aproximado" name="tempoTrabalho">
	    </div>

	    <div class="mb-3">
	      <label for="condicaoPneus">Tipo de Manutenção:</label>
	      <input type="text" class="form-control" value="Corretiva" id="tipoManutencao" placeholder="Entre com o tipo de manutenção" name="tipoManutencao">
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>