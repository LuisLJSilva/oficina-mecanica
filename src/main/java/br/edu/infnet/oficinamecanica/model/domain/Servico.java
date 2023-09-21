package br.edu.infnet.oficinamecanica.model.domain;

public abstract class Servico {
	
	
	private String tipoServico;
	private float preco;
	private int codigoServico;
	
	public Servico() {
		
	}
	
	public Servico(String tipoServico, float preco, int codigoServico) {
		this.tipoServico = tipoServico;
		this.preco = preco;
		this.codigoServico = codigoServico;
	}
	
	@Override
	public String toString() {
		return String.format("%s;%.2f;%d", tipoServico, preco, codigoServico);
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(int codigoServico) {
		this.codigoServico = codigoServico;
	}
	
	

}
