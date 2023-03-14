package it.shoppingtools.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.shoppingtools.model.User;


@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Long>{

	User findByUsernameAndPassword(String username, String password);
	
}
