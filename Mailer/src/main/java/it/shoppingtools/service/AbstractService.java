package it.shoppingtools.service;


import it.shoppingtools.mapper.BasicMapper;
import it.shoppingtools.mapper.mapperclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

public class AbstractService<DTO,Entity> implements ServiceDTO<DTO>{


    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }
    @Autowired
    protected MongoRepository<Entity,String> repository;
    mapperclass<DTO,Entity> converter = new mapperclass<DTO,Entity>();
    @Override
    public DTO insert(DTO dto) {
        return converter.toDto(repository.save(converter.toEntity(dto)));
    }

    @Override
    public DTO read(String id) {
        return converter.toDto(repository.findById(id).get());
    }

    @Override
    public DTO update(DTO dto) {
        return converter.toDto(repository.save(converter.toEntity(dto)));
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
