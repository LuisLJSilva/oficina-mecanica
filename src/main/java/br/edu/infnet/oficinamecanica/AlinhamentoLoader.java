package br.edu.infnet.oficinamecanica;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.oficinamecanica.model.domain.Alinhamento;
import br.edu.infnet.oficinamecanica.model.domain.Usuario;
import br.edu.infnet.oficinamecanica.model.service.AlinhamentoService;


@Order(4)
@Component
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
			
			alinhamento.setUsuario(new Usuario(Integer.valueOf(campos[6])));
			
			alinhamentoService.incluir(alinhamento);

			linha = leitura.readLine();

		}

		leitura.close();

	}
}
