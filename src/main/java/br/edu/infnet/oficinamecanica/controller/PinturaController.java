package br.edu.infnet.oficinamecanica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.oficinamecanica.model.domain.Pintura;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.service.PinturaService;

@Controller
public class PinturaController {
	
	@Autowired
	private PinturaService pinturaService;


	@GetMapping(value = "/pintura/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaPintura", pinturaService.obterLista(usuario));
		
		return "pintura/lista";
	}
	
	@GetMapping(value = "/pintura/cadastro")
	public String telaCadastro () {
		
		return "pintura/cadastro";
	}
	
	@PostMapping(value = "/pintura/incluir") 
	public String incluir(Pintura pintura, @SessionAttribute("user") Usuario usuario) {
		
		pintura.setUsuario(usuario);
		
		pinturaService.incluir(pintura);
				
		return "redirect:/pintura/lista";
	}

	@GetMapping(value = "/pintura/{id}/excluir") 
	public String exclusao(@PathVariable Integer id) {
		
		pinturaService.excluir(id);

		return "redirect:/pintura/lista";
	}


}
