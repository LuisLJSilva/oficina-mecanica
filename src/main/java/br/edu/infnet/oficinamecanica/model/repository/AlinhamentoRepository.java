package br.edu.infnet.oficinamecanica.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.oficinamecanica.model.domain.Alinhamento;

@Repository
public interface AlinhamentoRepository extends CrudRepository<Alinhamento, Integer> {

}