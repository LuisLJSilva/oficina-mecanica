package br.edu.infnet.oficinamecanica.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.oficinamecanica.model.domain.Pintura;

@Repository
public interface PinturaRepository extends CrudRepository<Pintura, Integer> {

}
