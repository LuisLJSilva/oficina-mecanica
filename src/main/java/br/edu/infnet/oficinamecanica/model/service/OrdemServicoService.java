package br.edu.infnet.oficinamecanica.model.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.oficinamecanica.model.domain.OrdemServico;

@Service
public class OrdemServicoService {
	
	private Map<LocalDateTime, OrdemServico> mapaOrdemServico = new HashMap<LocalDateTime, OrdemServico>();

	public Collection<OrdemServico> obterLista(){
		return mapaOrdemServico.values();
	}
	
	public void incluir(OrdemServico ordemServico) {
		mapaOrdemServico.put(ordemServico.getDataAgendamento(), ordemServico);		
		System.out.println("[OrdemServico] Inclusão realizada com sucesso: " + ordemServico);		
	}
	
	public void excluir(LocalDateTime dataAgendamento) {
		mapaOrdemServico.remove(dataAgendamento);
	}

}
