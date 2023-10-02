package br.edu.infnet.oficinamecanica.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.oficinamecanica.model.domain.OrdemServico;

@Repository
public interface OrdemServicoRepository extends CrudRepository<OrdemServico, Integer> {
	
	@Query("from OrdemServico os where os.usuario.id =:userid")
	public List<OrdemServico> obterLista(Integer userid);

}
