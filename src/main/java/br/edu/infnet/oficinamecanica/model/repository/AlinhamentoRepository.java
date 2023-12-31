package br.edu.infnet.oficinamecanica.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.oficinamecanica.model.domain.Alinhamento;

@Repository
public interface AlinhamentoRepository extends CrudRepository<Alinhamento, Integer> {
	
	@Query("from Alinhamento a where a.usuario.id =:userid")
	public List<Alinhamento> obterLista(Integer userid);

}
