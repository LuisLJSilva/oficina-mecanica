package br.edu.infnet.oficinamecanica.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.oficinamecanica.model.domain.Alinhamento;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.repository.AlinhamentoRepository;

@Service
public class AlinhamentoService {
	
	@Autowired
	private AlinhamentoRepository alinhamentoRepository;
	
	public Collection<Alinhamento> obterLista(){
		
		return (Collection<Alinhamento>) alinhamentoRepository.findAll();
		
	}
	
	public Collection<Alinhamento> obterLista(Usuario usuario) {
		
		return (Collection<Alinhamento>) alinhamentoRepository.obterLista(usuario.getId()); 
		
	}
	
	public void incluir(Alinhamento alinhamento) {
		
		alinhamentoRepository.save(alinhamento);
	
	}
	
	public void excluir(Integer id) {
		
		alinhamentoRepository.deleteById(id);
	}
	
}
