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
	  <h2>Inclusão de Serviço - Pintura </h2>
	  
	  <form action="/pintura/incluir" method="post">
	  
	  <c:import url="/WEB-INF/jsp/servico/cadastro.jsp"/>
	    
   	    <div class="mb-3">
	      <label for="ajusteCambagem">Intensidade de Brilho:</label>
	      <input type="number" step="0.01" class="form-control" value="0.5" id="intensidadeBrilho" placeholder="Entre com a intensidade de brilho" name="intensidadeBrilho">
	    </div>
	    
	    
	    <div class="mb-3">
	      <label for="freiosVerificados">Tinta Ecológica:</label>
	      <input type="checkbox" class="form-check-input" id="tintaEcologica" name="tintaEcologica">
	    </div>
	    
	    <div class="mb-3">
	      <label for="condicaoPneus">Cor:</label>
	      <input type="text" class="form-control" value="Azul" id="cor" placeholder="Entre com a cor" name="cor">
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>