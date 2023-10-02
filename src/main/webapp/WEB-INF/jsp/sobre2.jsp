<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt">
<head>
	<meta charset="ISO-8859-1">
	<title>Oficina Mecânica</title>
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
				<h1>Documentação das Classes</h1>
								
				<p class="lead">Sistema de agendamento de serviços para seu automóvel</p>
		</div>
		</div>
		<h3>Classe OrdemServico</h3>
		<p>Representa uma ordem de serviço na oficina mecânica.</p>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>urgente</td>
					<td>boolean</td>
					<td>Se o agendamento é urgente ou não</td>
				</tr>
				<tr>
					<td>dataAgendamento</td>
					<td>LocalDateTime</td>
					<td>Data e hora da ordem de serviço</td>
				</tr>
				<tr>
					<td>status</td>
					<td>String</td>
					<td>Status da ordem de serviço (Em andamento, Concluído, Agendado)</td>
				</tr>
			</tbody>
		</table>

		<!-- Cliente -->
		<h3>Classe Cliente</h3>
		<p>Representa o cliente que solicitou a ordem de serviço.</p>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>nome</td>
					<td>String</td>
					<td>Nome do cliente</td>
				</tr>
				<tr>
					<td>cpf</td>
					<td>String</td>
					<td>CPF do cliente</td>
				</tr>
				<tr>
					<td>email</td>
					<td>String</td>
					<td>E-mail para contato</td>
				</tr>
			</tbody>
		</table>

		<h3>Classe Servico</h3>
		<p>Representa um tipo de serviço que pode ser oferecido pela
			oficina.</p>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>tipoServico</td>
					<td>String</td>
					<td>Descrição do tipo de serviço (Manutenção, Pintura, Alinhamento)</td>
				</tr>
				<tr>
					<td>preco</td>
					<td>float</td>
					<td>Preço do serviço</td>
				</tr>
				<tr>
					<td>codigoServico</td>
					<td>int</td>
					<td>codigo para identificação do serviço</td>
				</tr>
			</tbody>
		</table>

		<h3>Classe Manutencao</h3>
		<p>Classe responsável por armazenar informações sobre a manutenção
			de veículos.</p>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>necessitaPeca</td>
					<td>boolean</td>
					<td>Se o veículo necessita de peças adicionais ou não</td>
				</tr>
				<tr>
					<td>tempoTrabalho</td>
					<td>float</td>
					<td>tempo estimado de trabalho para concluir a manutenção, em horas</td>
				</tr>
				<tr>
					<td>tipoManutencao</td>
					<td>String</td>
					<td>Tipo de manutenção a ser realizada (Preventiva, Corretiva, Estética)</td>
				</tr>
			</tbody>
		</table>

		<h3>Classe Pintura</h3>
		<p>Classe responsável por armazenar informações sobre a pintura de
			veículos.</p>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>intensidadeBrilho</td>
					<td>float</td>
					<td> Índice de brilho da pintura após a aplicação, em uma escala de 0 a 100</td>
				</tr>
				<tr>
					<td>tintaEcologica</td>
					<td>boolean</td>
					<td>Indica se a tinta usada na pintura é ecológica ou não</td>
				</tr>
				<tr>
					<td>cor</td>
					<td>String</td>
					<td>Cor da pintura que será aplicada (Azul, Vermelho, Preto)</td>
				</tr>
			</tbody>
		</table>

		<h3>Classe Alinhamento</h3>
		<p>Classe responsável por armazenar informações sobre o
			alinhamento de veículos.</p>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>ajusteCambagem</td>
					<td>float</td>
					<td>Ajuste de cambagem em graus</td>
				</tr>
				<tr>
					<td>freiosVerificados</td>
					<td>boolean</td>
					<td>Se os freios foram verificados durante o alinhamento ou não</td>
				</tr>
				<tr>
					<td>condicaoPneus</td>
					<td>String</td>
					<td>Condição dos pneus (Novo, Usado, Desgastado)</td>
				</tr>
			</tbody>
		</table>
		
		<h3>Classe Usuario</h3>
<p>Representa o usuário que pode acessar o sistema de agendamento.</p>
<table class="table table-bordered">
    <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do usuário</td>
        </tr>
        <tr>
            <td>email</td>
            <td>String</td>
            <td>Email para acesso ao sistema</td>
        </tr>
        <tr>
            <td>senha</td>
            <td>String</td>
            <td>Senha para autenticação no sistema</td>
        </tr>
    </tbody>
</table>


	</div>
</body>
</html>
