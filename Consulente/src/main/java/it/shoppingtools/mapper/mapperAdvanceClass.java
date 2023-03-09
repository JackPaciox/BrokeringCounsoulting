package it.shoppingtools.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class mapperAdvanceClass<DTO,ENTITY> implements ListMapper<DTO,ENTITY>{

    @Override
    public List<ENTITY> toEntityList(List<DTO> dtoList) {
        return (List<ENTITY>) dtoList;
    }

    @Override
    public List<DTO> toDTOList(List<ENTITY> entities) {
        return (List<DTO>) entities;
    }

    @Override
    public ENTITY toEntity(DTO dto) {
        return (ENTITY) dto;
    }

    @Override
    public DTO toDto(ENTITY entity) {
        return (DTO) entity;
    }
}
