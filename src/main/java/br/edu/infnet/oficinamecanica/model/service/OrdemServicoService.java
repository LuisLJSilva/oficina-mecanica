package br.edu.infnet.oficinamecanica.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.oficinamecanica.model.domain.OrdemServico;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.repository.OrdemServicoRepository;

@Service
public class OrdemServicoService {
	
	@Autowired
	OrdemServicoRepository ordemServicoRepository;
	
	public Collection<OrdemServico> obterLista(){
		
		
		return (Collection<OrdemServico>) ordemServicoRepository.findAll();
		
	}
	
	public Collection<OrdemServico> obterLista(Usuario usuario) {
		
		return (Collection<OrdemServico>) ordemServicoRepository.obterLista(usuario.getId()); 
		
	}
	
	public void incluir(OrdemServico ordemServico) {
		
		ordemServicoRepository.save(ordemServico);
	}
	
	public void excluir(Integer id) {
		ordemServicoRepository.deleteById(id);
	}

}
