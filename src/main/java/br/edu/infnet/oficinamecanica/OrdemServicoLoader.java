package br.edu.infnet.oficinamecanica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.oficinamecanica.model.domain.Alinhamento;
import br.edu.infnet.oficinamecanica.model.domain.Cliente;
import br.edu.infnet.oficinamecanica.model.domain.Manutencao;
import br.edu.infnet.oficinamecanica.model.domain.OrdemServico;
import br.edu.infnet.oficinamecanica.model.domain.Pintura;
import br.edu.infnet.oficinamecanica.model.domain.Servico;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.service.OrdemServicoService;


@Component
public class OrdemServicoLoader implements ApplicationRunner {
	
	@Autowired
	private OrdemServicoService ordemServicoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<LocalDateTime, OrdemServico> mapaOrdemServico = new HashMap<LocalDateTime, OrdemServico>();
		
		FileReader file = new FileReader("arquivos/ordemServicoCliente.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		OrdemServico ordemServico = null;
		
		while(linha != null) {
			campos = linha.split(";");
			
			switch (campos[0]) {
			case "OS":
				
				ordemServico = new OrdemServico(
						campos[1],
						new Cliente(Integer.valueOf(campos[2])),
						new ArrayList<Servico>(),
						new Usuario(1)
					);
				
				mapaOrdemServico.put(ordemServico.getDataAgendamento(), ordemServico);
				
				break;
				
			case "M":

				ordemServico.getServicos().add(new Manutencao (Integer.valueOf(campos[1])));
				
				break;
				
			case "P":
				
				
				ordemServico.getServicos().add(new Pintura (Integer.valueOf(campos[1])));
				
				break;
				
			case "A":

				ordemServico.getServicos().add(new Alinhamento (Integer.valueOf(campos[1])));

				
				break;
				
			default:
				break;
			}
			
			linha = leitura.readLine();			
		}
		
		for(OrdemServico os : mapaOrdemServico.values()) {
			ordemServicoService.incluir(os);
			System.out.println("[Ordem Servico] Inclusão realizada com sucesso: " + os);			
		}
		
		for(OrdemServico os : ordemServicoService.obterLista()) {
			System.out.println("[Ordem Servico] Inclusão realizada com sucesso: " + os);			
		}

		
		leitura.close();		 
	} 

}
