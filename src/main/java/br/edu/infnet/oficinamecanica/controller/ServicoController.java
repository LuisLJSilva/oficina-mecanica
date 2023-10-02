package br.edu.infnet.oficinamecanica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.oficinamecanica.model.domain.Servico;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.service.ServicoService;

@Controller
public class ServicoController {
	
	@Autowired
	private  ServicoService servicoService;
	
	

	@GetMapping(value = "/servico/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaServico", servicoService.obterLista(usuario));
		
		return "servico/lista"; 
	}
	
	@GetMapping(value = "/servico/cadastro")
	public String telaCadastro () {
		
		return "servico/cadastro";
	}
	
	@PostMapping(value = "/servico/incluir") 
	public String incluir(Servico servico) {
		
		servicoService.incluir(servico);
				
		return "redirect:/servico/lista";
	}
	
	public void excluir(Integer id) {
		servicoService.excluir(id);
	}

	@GetMapping(value = "/servico/{id}/excluir") 
	public String exclusao(@PathVariable Integer id) {
		
		servicoService.excluir(id);

		return "redirect:/servico/lista";
	}


}
