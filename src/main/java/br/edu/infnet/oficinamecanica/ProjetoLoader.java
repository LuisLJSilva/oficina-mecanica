package br.edu.infnet.oficinamecanica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.oficinamecanica.controller.OficinaController;

import br.edu.infnet.oficinamecanica.model.oficina.Atributo;
import br.edu.infnet.oficinamecanica.model.oficina.Classe;
import br.edu.infnet.oficinamecanica.model.oficina.Projeto;

@Order(7)
@Component
public class ProjetoLoader implements ApplicationRunner {
	
	@Autowired
	private OficinaController oficinaController;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/projeto.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		Projeto projeto = null;
		Classe classe = null;
		
		while(linha != null) {
			campos = linha.split(";"); 

			switch (campos[0]) {
			case "P":
				projeto = new Projeto(campos[1], campos[2]);
				projeto.setClasses(new ArrayList<Classe>());
				
				break;

			case "C":
				
				classe = new Classe(campos[1]);
				classe.setAtributos(new ArrayList<Atributo>());
				
				projeto.getClasses().add(classe);
				
				break;

			case "A":
								
				classe.getAtributos().add(new Atributo(campos[1], campos[2], campos[3]));
				
				break;
			
			default:
				break;
			}
			
			linha = leitura.readLine();
		}

		oficinaController.incluir(projeto);

		leitura.close();				
	}
}
