package br.edu.infnet.oficinamecanica.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TManutencao")
public class Manutencao extends Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private boolean necessitaPeca;
	private float tempoTrabalho;
	private String tipoManutencao;
	
	public Manutencao() {
		
	}
	
	public Manutencao(String tipoServico, float preco, int codigoServico, boolean necessitaPeca, float tempoTrabalho, String tipoManutencao) {
		super (tipoServico, preco, codigoServico);
		this.necessitaPeca = necessitaPeca;
		this.tempoTrabalho = tempoTrabalho;
		this.tipoManutencao = tipoManutencao;		
	}
	
	@Override
	public String toString() {
		return String.format("%s;%s;%.2f;%s",
				super.toString(),
				necessitaPeca,
				tempoTrabalho,
				tipoManutencao
				);
	}

	public boolean isNecessitaPeca() {
		return necessitaPeca;
	}

	public void setNecessitaPeca(boolean necessitaPeca) {
		this.necessitaPeca = necessitaPeca;
	}

	public float getTempoTrabalho() {
		return tempoTrabalho;
	}

	public void setTempoTrabalho(float tempoTrabalho) {
		this.tempoTrabalho = tempoTrabalho;
	}

	public String getTipoManutencao() {
		return tipoManutencao;
	}

	public void setTipoManutencao(String tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
	}

}
