package it.shoppingtools.dao;

import javax.transaction.Transactional;

import it.shoppingtools.model.Consulente;
import it.shoppingtools.model.Experience;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface ConsulenteRepository extends CrudRepository<Experience, Long>{

}
