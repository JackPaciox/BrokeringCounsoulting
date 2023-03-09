package it.shoppingtools.mapper;

import org.mapstruct.Mapper;

public interface BasicMapper <DTO,Entity>{
    public Entity toEntity (DTO dto);
    public DTO toDto (Entity entity);
}

