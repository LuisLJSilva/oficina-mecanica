package br.edu.infnet.oficinamecanica.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "TPintura")
@Component
public class Pintura extends Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private float intensidadeBrilho;
	private boolean tintaEcologica;
	private String cor;
	
	public Pintura() {
		
	}
	
	public Pintura(String tipoServico, float preco, int codigoServico, boolean tintaEcologica, float intensidadeBrilho, String cor) {
		super (tipoServico, preco, codigoServico);
		this.intensidadeBrilho = intensidadeBrilho;
		this.tintaEcologica = tintaEcologica;
		this.cor = cor;		
	}
	
	@Override
	public String toString() {
		return String.format("%s;%.2f;%s;%s",
				super.toString(),
				intensidadeBrilho,
				tintaEcologica,
				cor
				);
	}

	public float getIntensidadeBrilho() {
		return intensidadeBrilho;
	}

	public void setIntensidadeBrilho(float intensidadeBrilho) {
		this.intensidadeBrilho = intensidadeBrilho;
	}

	public boolean isTintaEcologica() {
		return tintaEcologica;
	}

	public void setTintaEcologica(boolean tintaEcologica) {
		this.tintaEcologica = tintaEcologica;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
