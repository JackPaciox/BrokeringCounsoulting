package it.shoppingtools.service;


import it.shoppingtools.mapper.BasicMapper;
import it.shoppingtools.mapper.mapperclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public abstract class AbstractService<DTO,Entity> implements ServiceDTO<DTO>{


    @Override
    public boolean existsById(long id) {
        return repository.existsById(id);
    }
    @Autowired
    protected CrudRepository<Entity,Long> repository;
    mapperclass<DTO,Entity> converter = new mapperclass<DTO,Entity>();
    @Override
    public DTO insert(DTO dto) {
        return converter.toDto(repository.save(converter.toEntity(dto)));
    }

    @Override
    public DTO read(long id) {
        return converter.toDto(repository.findById(id).get());
    }

    @Override
    public DTO update(DTO dto) {
        return converter.toDto(repository.save(converter.toEntity(dto)));
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}
