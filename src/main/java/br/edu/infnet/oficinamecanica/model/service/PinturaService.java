package br.edu.infnet.oficinamecanica.model.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.oficinamecanica.model.domain.Pintura;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.repository.PinturaRepository;

@Service
public class PinturaService {
	
	@Autowired
	private PinturaRepository pinturaRepository;
	

	public Collection<Pintura> obterLista(){
		
		return(Collection<Pintura>) pinturaRepository.findAll();
	}
	
public Collection<Pintura> obterLista(Usuario usuario){
		
		return(Collection<Pintura>) pinturaRepository.obterLista(usuario.getId());
	}
	
	public void incluir(Pintura pintura) {

		pinturaRepository.save(pintura);
	
	}
	
	public void excluir(Integer id) {
		pinturaRepository.deleteById(id);
	}

	
}
