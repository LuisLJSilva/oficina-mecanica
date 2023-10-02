package br.edu.infnet.oficinamecanica.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.oficinamecanica.model.domain.Servico;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.repository.ServicoRepository;

@Service
public class ServicoService {
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	public Collection<Servico> obterLista(){
		
		return (Collection<Servico>) servicoRepository.findAll();
		
	}
	
	public Collection<Servico> obterLista(Usuario usuario) {
		
		return (Collection<Servico>) servicoRepository.obterLista(usuario.getId()); 
		
	}
	
	public void incluir(Servico servico) {
		
		servicoRepository.save(servico);
	
	}
	
	public void excluir(Integer id) {
		
		servicoRepository.deleteById(id);
	}
	
}
