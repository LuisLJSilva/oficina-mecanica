package br.edu.infnet.oficinamecanica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.oficinamecanica.model.domain.Cliente;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listaCliente", clienteService.obterLista(usuario));
		
		return "cliente/lista";
	}
	
	@GetMapping(value = "/cliente/cadastro")
	public String telaCadastro () {
		
		return "cliente/cadastro";
	}
	
	@PostMapping(value = "/cliente/incluir") 
	public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {
		
		cliente.setUsuario(usuario);
		
		clienteService.incluir(cliente);
				
		return "redirect:/cliente/lista";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir") 
	public String exclusao(@PathVariable Integer id) {
		
		clienteService.excluir(id);
 
		return "redirect:/cliente/lista";
	}


}
