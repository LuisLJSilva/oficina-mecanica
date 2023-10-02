 package br.edu.infnet.oficinamecanica.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.oficinamecanica.model.domain.Manutencao;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.repository.ManutencaoRepository;

@Service
public class ManutencaoService {
	
	@Autowired
	ManutencaoRepository manutencaoRepository;
	
	public Collection<Manutencao> obterLista(){
		
		
		return (Collection<Manutencao>) manutencaoRepository.findAll();
		
	}
	
	public Collection<Manutencao> obterLista(Usuario usuario) {
		
		return (Collection<Manutencao>) manutencaoRepository.obterLista(usuario.getId()); 
		
	}
	
	public void incluir(Manutencao manutencao) {
		
		manutencaoRepository.save(manutencao);
	}
	
	public void excluir(Integer id) {
		manutencaoRepository.deleteById(id);
	}
	
}
