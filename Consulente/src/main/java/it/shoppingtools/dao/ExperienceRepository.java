package it.shoppingtools.dao;

import it.shoppingtools.model.Experience;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface ExperienceRepository extends MongoRepository<Experience, String>{

}
