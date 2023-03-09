package it.shoppingtools.dao;

import it.shoppingtools.model.Annuncio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface AnnuncioRepository extends CrudRepository<Annuncio, Long>{

}
