package it.shoppingtools.service;

import it.shoppingtools.mapper.BasicMapper;
import it.shoppingtools.mapper.ListMapper;
import it.shoppingtools.mapper.mapperAdvanceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public abstract class AbstractAdvanceService<DTO,Entity> extends AbstractService<DTO,Entity> implements AdvancedServiceDTO<DTO>{

    @Autowired
    protected CrudRepository<Entity,Long> repository;


    mapperAdvanceClass<DTO,Entity> converter = new mapperAdvanceClass<DTO,Entity>();

    @Override
    public Iterable<DTO> insertAll(List<DTO> dtoList) {
        return (Iterable<DTO>) converter.toDTOList((List<Entity>) repository.saveAll(converter.toEntityList(dtoList)));
    }
    @Override
    public List<DTO> getAll() {
        return converter.toDTOList((List<Entity>) repository.findAll());
    }
}
