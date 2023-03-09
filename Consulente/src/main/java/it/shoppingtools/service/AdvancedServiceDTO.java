package it.shoppingtools.service;

import java.util.List;

public interface AdvancedServiceDTO<DTO> extends ServiceDTO<DTO>{

    public Iterable<DTO> getAll();

    public Iterable<DTO> insertAll (List<DTO> dtoList);


}
