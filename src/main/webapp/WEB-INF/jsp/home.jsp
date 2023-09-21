<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt">
<head>
	<meta charset="ISO-8859-1">
	<title>Oficina Mecanica</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<style>
		.hero-section {
			background-color: #f9f9f9;
			padding: 50px 0;
			border-radius: 8px;
			box-shadow: 0 4px 6px rgba(0,0,0,0.1);
		}
	</style>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container-fluid hero-section mt-5">
		<div class="row">
			<div class="col-md-8 offset-md-2 text-center">
				<h1>Oficina Mecânica</h1>
				<p class="lead">Sistema de agendamento de serviços para seu automóvel</p>
			</div>
		</div>
	</div>

</body>
</html>
