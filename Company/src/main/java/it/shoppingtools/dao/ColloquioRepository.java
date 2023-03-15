package it.shoppingtools.dao;

import it.shoppingtools.model.Colloquio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface ColloquioRepository extends MongoRepository<Colloquio, String> {

}
