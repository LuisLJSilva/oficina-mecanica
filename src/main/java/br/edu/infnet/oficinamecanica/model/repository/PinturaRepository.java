package br.edu.infnet.oficinamecanica.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.oficinamecanica.model.domain.Pintura;

@Repository
public interface PinturaRepository extends CrudRepository<Pintura, Integer> {
	
	@Query("from Pintura p where p.usuario.id =:userid")
	public List<Pintura> obterLista(Integer userid);


}
