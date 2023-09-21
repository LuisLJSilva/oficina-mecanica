package br.edu.infnet.oficinamecanica.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class OrdemServico {
	
	private String status;
	private LocalDateTime dataAgendamento;
	private boolean urgente;
	private Cliente cliente;
	private List<Servico> servicos;
	
	
	public OrdemServico() {
		status = "Agendado";
		dataAgendamento = LocalDateTime.now();
		urgente = true;
	}
	
	public OrdemServico(String status, Cliente cliente, List<Servico> servicos) {
		this();
		this.status = status;
		this.cliente = cliente;
		this.servicos = servicos;
	}
	
	@Override
	public String toString() {
		return status + ";" + dataAgendamento + ";" + urgente + ";" + cliente + ";" + servicos.size();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDateTime dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public boolean isUrgente() {
		return urgente;
	}

	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
	

}
