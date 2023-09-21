package br.edu.infnet.oficinamecanica;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import br.edu.infnet.oficinamecanica.model.domain.Pintura;
import br.edu.infnet.oficinamecanica.model.service.PinturaService;

@Order(3)
@Component
@Controller
public class PinturaLoader implements ApplicationRunner {
	
	@Autowired
	private PinturaService pinturaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/pintura.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			Pintura pintura = new Pintura(
							  campos[0],
							  Float.valueOf(campos[1]),
							  Integer.valueOf(campos[2]),
							  Boolean.valueOf(campos[3]),
							  Float.valueOf(campos[4]),
							  campos[5]);

			pinturaService.incluir(pintura);

			linha = leitura.readLine();

		}

		leitura.close();

	}
}
