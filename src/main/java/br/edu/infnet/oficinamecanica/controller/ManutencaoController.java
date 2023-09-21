package br.edu.infnet.oficinamecanica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.oficinamecanica.model.domain.Manutencao;
import br.edu.infnet.oficinamecanica.model.service.ManutencaoService;

@Controller
public class ManutencaoController {
	
	@Autowired
	private  ManutencaoService manutencaoService;

	@GetMapping(value = "/manutencao/lista")
	public String telaLista(Model model) {

		model.addAttribute("listaManutencao", manutencaoService.obterLista());
		
		return "manutencao/lista";
	}
	
	@GetMapping(value = "/manutencao/cadastro")
	public String telaCadastro () {
		
		return "manutencao/cadastro";
	}
	
	@PostMapping(value = "/manutencao/incluir") 
	public String incluir(Manutencao manutencao) {
		
		manutencaoService.incluir(manutencao);
				
		return "redirect:/manutencao/lista";
	}

	@GetMapping(value = "/manutencao/{codigoServico}/excluir") 
	public String exclusao(@PathVariable int codigoServico) {
		
		manutencaoService.excluir(codigoServico);

		return "redirect:/manutencao/lista";
	}


}
