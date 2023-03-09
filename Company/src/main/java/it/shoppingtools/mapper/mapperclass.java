package it.shoppingtools.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
public class mapperclass<ENTITY,DTO> implements BasicMapper<ENTITY,DTO> {
    @Override
    public DTO toEntity(ENTITY entity) {
        return (DTO) entity;
    }

    @Override
    public ENTITY toDto(DTO dto) {
        return (ENTITY) dto;
    }
}
