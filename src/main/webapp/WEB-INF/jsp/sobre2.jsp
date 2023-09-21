<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sistema Oficina Mecanica</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Sistema Oficina Mecanica - Documentação das Classes</h2>

		<!-- OrdemServico -->
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
					<td>numeroOrdem</td>
					<td>int</td>
					<td>Número da ordem de serviço</td>
				</tr>
				<tr>
					<td>data</td>
					<td>LocalDateTime</td>
					<td>Data e hora da ordem de serviço</td>
				</tr>
				<tr>
					<td>status</td>
					<td>String</td>
					<td>Status da ordem (Em andamento, Concluído, etc.)</td>
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
					<td>telefone</td>
					<td>String</td>
					<td>Telefone para contato</td>
				</tr>
			</tbody>
		</table>

		<!-- Servico (Classe mãe) -->
		<h3>Classe Servico (Classe mãe)</h3>
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
					<td>descricao</td>
					<td>String</td>
					<td>Descrição do serviço</td>
				</tr>
				<tr>
					<td>preco</td>
					<td>float</td>
					<td>Preço do serviço</td>
				</tr>
				<tr>
					<td>tempoEstimado</td>
					<td>int</td>
					<td>Tempo estimado para a conclusão (em minutos)</td>
				</tr>
			</tbody>
		</table>

		<!-- Manutencao -->
		<h3>Classe Manutencao (Classe filha)</h3>
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
					<td>tipo</td>
					<td>String</td>
					<td>Tipo de manutenção (preventiva, corretiva, etc.)</td>
				</tr>
				<tr>
					<td>ferramentasNecessarias</td>
					<td>String</td>
					<td>Ferramentas necessárias para realizar a manutenção</td>
				</tr>
				<tr>
					<td>tempoEstimado</td>
					<td>int</td>
					<td>Tempo estimado para a conclusão da manutenção, em minutos</td>
				</tr>
			</tbody>
		</table>

		<!-- Pintura -->
		<h3>Classe Pintura (Classe filha)</h3>
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
					<td>cor</td>
					<td>String</td>
					<td>Cor da pintura que será aplicada</td>
				</tr>
				<tr>
					<td>tipoTinta</td>
					<td>String</td>
					<td>Tipo da tinta utilizada (à base de água, esmalte, etc.)</td>
				</tr>
				<tr>
					<td>area</td>
					<td>float</td>
					<td>Área a ser pintada em metros quadrados</td>
				</tr>
			</tbody>
		</table>

		<!-- Alinhamento -->
		<h3>Classe Alinhamento (Classe filha)</h3>
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
					<td>eixo</td>
					<td>String</td>
					<td>Eixo a ser alinhado (dianteiro, traseiro, etc.)</td>
				</tr>
				<tr>
					<td>modeloCarro</td>
					<td>String</td>
					<td>Modelo do carro que vai receber o alinhamento</td>
				</tr>
				<tr>
					<td>nivelDificuldade</td>
					<td>int</td>
					<td>Nível de dificuldade do alinhamento, em uma escala de 1 a
						5</td>
				</tr>
			</tbody>
		</table>

		<!-- Oficina -->
		<h3>Classe Oficina</h3>
		<p>Classe principal que gerencia os serviços e clientes da
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
					<td>nome</td>
					<td>String</td>
					<td>Nome da Oficina</td>
				</tr>
				<tr>
					<td>endereco</td>
					<td>String</td>
					<td>Endereço da oficina</td>
				</tr>
			</tbody>
		</table>

	</div>
</body>
</html>
