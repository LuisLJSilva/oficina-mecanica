package br.edu.infnet.oficinamecanica;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import br.edu.infnet.oficinamecanica.model.domain.Alinhamento;
import br.edu.infnet.oficinamecanica.model.service.AlinhamentoService;

@Order(2)
@Component
@Controller
public class AlinhamentoLoader implements ApplicationRunner {
	
	@Autowired
	private AlinhamentoService alinhamentoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/alinhamento.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			Alinhamento alinhamento = new Alinhamento(
									campos[0],
									Float.valueOf(campos[1]),
									Integer.valueOf(campos[2]),			
									Boolean.valueOf(campos[3]),
									Float.valueOf(campos[4]),
									campos[5]);
			
			alinhamentoService.incluir(alinhamento);

			linha = leitura.readLine();

		}

		leitura.close();

	}
}
