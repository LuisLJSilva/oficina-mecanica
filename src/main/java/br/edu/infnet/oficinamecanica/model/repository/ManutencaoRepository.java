package br.edu.infnet.oficinamecanica.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.oficinamecanica.model.domain.Manutencao;

@Repository
public interface ManutencaoRepository extends CrudRepository<Manutencao, Integer> {
	
	@Query("from Manutencao m where m.usuario.id =:userid")
	public List<Manutencao> obterLista(Integer userid);

}
