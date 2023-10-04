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
import br.edu.infnet.oficinamecanica.model.service.ClienteService;
import br.edu.infnet.oficinamecanica.model.service.OrdemServicoService;
import br.edu.infnet.oficinamecanica.model.service.ServicoService;


@Controller
public class OrdemServicoController {
	
	@Autowired
	private OrdemServicoService ordemServicoService;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private ServicoService servicoService;
	
	
	@GetMapping(value = "/ordemservico/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaOrdemServico", ordemServicoService.obterLista(usuario));
		
		return "ordemservico/lista"; 
	}

	@GetMapping(value = "/ordemservico")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("clientes", clienteService.obterLista(usuario));

		model.addAttribute("servicos", servicoService.obterLista(usuario));
		
		return "ordemservico/cadastro"; 
	}
	
	@PostMapping(value = "/ordemservico/incluir") 
	public String incluir(OrdemServico ordemServico, @SessionAttribute("user") Usuario usuario) {
		
		ordemServico.setUsuario(usuario);
		ordemServicoService.incluir(ordemServico);
				
		return "redirect:/ordemservico/lista";
	}

	@GetMapping(value = "/ordemservico/{id}/excluir") 
	public String excluir(@PathVariable Integer id) {
		
		ordemServicoService.excluir(id);

		return "redirect:/ordemservico/lista";
	}

}
