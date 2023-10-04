package br.edu.infnet.oficinamecanica;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.oficinamecanica.model.domain.Alinhamento;
import br.edu.infnet.oficinamecanica.model.domain.Manutencao;
import br.edu.infnet.oficinamecanica.model.domain.Pintura;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.service.ServicoService;

@Order(3)
@Component
public class ServicoLoader implements ApplicationRunner {
	
	@Autowired
	private ServicoService servicoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("arquivos/servico.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");
			
			switch (campos[7]) {
			
			case "A":
				
				Alinhamento alinhamento = new Alinhamento(
						campos[0],
						Float.valueOf(campos[1]),
						Integer.valueOf(campos[2]),			
						Boolean.valueOf(campos[3]),
						Float.valueOf(campos[4]),
						campos[5]);

				alinhamento.setUsuario(new Usuario(Integer.valueOf(campos[6])));

				servicoService.incluir(alinhamento);
				
				break;
				
			case "M":

				Manutencao manutencao = new Manutencao(
						campos[0],
						Float.valueOf(campos[1]),
						Integer.valueOf(campos[2]),
		  				Boolean.valueOf(campos[3]),
						Float.valueOf(campos[4]),
						campos[5]);

				manutencao.setUsuario(new Usuario(Integer.valueOf(campos[6])));
				
				servicoService.incluir(manutencao);
				
				break;
				
			case "P":
				
				
				Pintura pintura = new Pintura(
						  campos[0],
						  Float.valueOf(campos[1]),
						  Integer.valueOf(campos[2]),
						  Boolean.valueOf(campos[3]),
						  Float.valueOf(campos[4]),
						  campos[5]);
		
				pintura.setUsuario(new Usuario(Integer.valueOf(campos[6])));
				
				servicoService.incluir(pintura);
				
				break;
				

				
			default:
				break;
			}
			
			linha = leitura.readLine();			
		}
		
		leitura.close();		 
	} 

}
