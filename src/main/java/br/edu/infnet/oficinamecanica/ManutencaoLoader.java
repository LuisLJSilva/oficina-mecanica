package br.edu.infnet.oficinamecanica;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.oficinamecanica.model.domain.Manutencao;
import br.edu.infnet.oficinamecanica.model.service.ManutencaoService;

@Order(1)
@Component
public class ManutencaoLoader implements ApplicationRunner {
	
	@Autowired
	private ManutencaoService manutencaoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/manutencao.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			Manutencao manutencao = new Manutencao(
									campos[0],
									Float.valueOf(campos[1]),
									Integer.valueOf(campos[2]),
									Boolean.valueOf(campos[3]),
									Float.valueOf(campos[4]),
									campos[5]);

			manutencaoService.incluir(manutencao);

			linha = leitura.readLine();

		}

		leitura.close();

	}
}
