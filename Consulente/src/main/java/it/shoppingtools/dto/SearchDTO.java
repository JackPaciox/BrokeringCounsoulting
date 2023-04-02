package it.shoppingtools.dto;

import jdk.jfr.Category;

import java.util.List;

public class SearchDTO {
    private String word;
    private Category category;
    private CityDTO city;

    private List<FilterDTO> filterDTOS;
}
