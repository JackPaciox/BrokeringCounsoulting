package it.shoppingtools.dao;

import javax.transaction.Transactional;

import it.shoppingtools.dto.CityDTO;
import it.shoppingtools.model.Consulente;
import it.shoppingtools.model.Experience;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface ConsulenteRepository extends MongoRepository<Consulente, String>{
    List<Consulente> FindByCity(CityDTO city);
}
