package it.shoppingtools.dao;

import javax.transaction.Transactional;

import it.shoppingtools.model.Mail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface MailRepository extends MongoRepository<Mail, String>{

}
