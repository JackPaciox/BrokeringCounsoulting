package it.shoppingtools.dao;

import javax.transaction.Transactional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.shoppingtools.model.User;


@Repository
@Transactional
public interface UserRepository extends MongoRepository<User, Long>{

	User findByUsernameAndPassword(String username, String password);
	
}
