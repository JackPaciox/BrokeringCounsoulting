package it.shoppingtools.dao;

import it.shoppingtools.model.Annuncio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface AnnuncioRepository extends MongoRepository<Annuncio, String>{

}
