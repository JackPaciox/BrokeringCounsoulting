package it.shoppingtools.dao;

import javax.transaction.Transactional;

import it.shoppingtools.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Company, Long>{

}
