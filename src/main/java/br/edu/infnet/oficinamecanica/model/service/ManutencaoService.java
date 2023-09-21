package br.edu.infnet.oficinamecanica.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.oficinamecanica.model.domain.Manutencao;

@Service
public class ManutencaoService {
	
	private Map<Integer, Manutencao> mapaManutencao = new HashMap<Integer, Manutencao>();

	public Collection<Manutencao> obterLista(){
		return mapaManutencao.values();
	}
	
	public void incluir(Manutencao manutencao) {
		mapaManutencao.put(manutencao.getCodigoServico(), manutencao);		
		System.out.println("[Manutencao] Inclusão realizada com sucesso: " + manutencao);		
	}
	
	public void excluir(int getCodigoServico) {
		mapaManutencao.remove(getCodigoServico);
	}
	
}
