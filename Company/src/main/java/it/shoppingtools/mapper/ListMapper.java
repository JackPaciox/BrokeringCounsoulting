package it.shoppingtools.mapper;

import org.springframework.stereotype.Component;

import java.util.List;
public interface ListMapper<DTO,Entity> extends BasicMapper<DTO,Entity>{
    List<Entity> toEntityList (List<DTO> dtoList);

    List<DTO> toDTOList (List<Entity> entityList);
}
