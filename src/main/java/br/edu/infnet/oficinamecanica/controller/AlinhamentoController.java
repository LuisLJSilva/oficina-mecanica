package br.edu.infnet.oficinamecanica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.oficinamecanica.model.domain.Alinhamento;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.service.AlinhamentoService;

@Controller
public class AlinhamentoController {
	
	@Autowired
	private AlinhamentoService alinhamentoService;


	@GetMapping(value = "/alinhamento/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaAlinhamento", alinhamentoService.obterLista());
		
		return "alinhamento/lista";
	}
	
	@GetMapping(value = "/alinhamento/cadastro")
	public String telaCadastro () {
		
		return "alinhamento/cadastro";
	}
	
	@PostMapping(value = "/alinhamento/incluir") 
	public String incluir(Alinhamento alinhamento) {
		
		alinhamentoService.incluir(alinhamento);
				
		return "redirect:/alinhamento/lista";
	}

	@GetMapping(value = "/alinhamento/{id}/excluir") 
	public String exclusao(@PathVariable Integer id) {
		
		alinhamentoService.excluir(id);

		return "redirect:/alinhamento/lista";
	}


}
