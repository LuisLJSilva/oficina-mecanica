package br.edu.infnet.oficinamecanica.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.oficinamecanica.model.service.OrdemServicoService;


@Controller
public class OrdemServicoController {
	
	@Autowired
	private OrdemServicoService ordemServicoService;

	
	@GetMapping(value = "/ordemservico/lista")
	public String telaLista(Model model) {

		model.addAttribute("listaOrdemServico", ordemServicoService.obterLista());
		
		return "ordemservico/lista";
	}

	@GetMapping(value = "/ordemservico/{dataAgendamento}/excluir") 
	public String exclusao(@PathVariable LocalDateTime dataAgendamento) {
		
		ordemServicoService.excluir(dataAgendamento);

		return "redirect:/ordemservico/lista";
	}

}
