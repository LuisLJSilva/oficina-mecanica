package br.edu.infnet.oficinamecanica.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "TAlinhamento")
@Component
public class Alinhamento extends Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private float ajusteCambagem;
	private boolean freiosVerificados;
	private String condicaoPneus;
	
	public Alinhamento() {

	}
	
	public Alinhamento(String tipoServico, float preco, int codigoServico, boolean freiosVerificados, float ajusteCambagem, String condicaoPneus) {
		super (tipoServico, preco, codigoServico);
		this.ajusteCambagem = ajusteCambagem;
		this.freiosVerificados = freiosVerificados;
		this.condicaoPneus = condicaoPneus;
	}
	
	@Override
	public String toString() {
		return String.format("%s;%.2f;%s;%s", 
				super.toString(),
				ajusteCambagem, 
				freiosVerificados, 
				condicaoPneus
			);
	}

	public float getAjusteCambagem() {
		return ajusteCambagem;
	}

	public void setAjusteCambagem(float ajusteCambagem) {
		this.ajusteCambagem = ajusteCambagem;
	}

	public boolean isFreiosVerificados() {
		return freiosVerificados;
	}

	public void setFreiosVerificados(boolean freiosVerificados) {
		this.freiosVerificados = freiosVerificados;
	}

	public String getCondicaoPneus() {
		return condicaoPneus;
	}

	public void setCondicaoPneus(String condicaoPneus) {
		this.condicaoPneus = condicaoPneus;
	}
	
}
