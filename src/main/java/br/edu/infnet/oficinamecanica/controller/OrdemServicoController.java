package br.edu.infnet.oficinamecanica.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.oficinamecanica.model.domain.OrdemServico;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.service.OrdemServicoService;


@Controller
public class OrdemServicoController {
	
	@Autowired
	private OrdemServicoService ordemServicoService;

	
	@GetMapping(value = "/ordemservico/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaOrdemServico", ordemServicoService.obterLista(usuario));
		
		return "ordemservico/lista"; 
	}

	@GetMapping(value = "/ordemservico/cadastro")
	public String telaCadastro () {
		
		return "ordemservico/cadastro";
	}
	
	@PostMapping(value = "/ordemservico/incluir") 
	public String incluir(OrdemServico ordemServico) {
		
		ordemServicoService.incluir(ordemServico);
				
		return "redirect:/ordemservico/lista";
	}
	
	public void excluir(Integer id) {
		ordemServicoService.excluir(id);
	}

	@GetMapping(value = "/ordemservico/{id}/excluir") 
	public String exclusao(@PathVariable Integer id) {
		
		ordemServicoService.excluir(id);

		return "redirect:/ordemservico/lista";
	}

}
