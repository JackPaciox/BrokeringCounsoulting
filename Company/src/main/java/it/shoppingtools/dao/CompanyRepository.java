package it.shoppingtools.dao;

import javax.transaction.Transactional;

import it.shoppingtools.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface CompanyRepository extends MongoRepository<Company, String>{

}
