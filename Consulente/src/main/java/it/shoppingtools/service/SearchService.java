package it.shoppingtools.service;

import it.shoppingtools.dao.ConsulenteRepository;
import it.shoppingtools.dto.*;
import it.shoppingtools.mapper.mapperAdvanceClass;
import it.shoppingtools.mapper.mapperclass;
import it.shoppingtools.model.Consulente;
import it.shoppingtools.model.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {

    @Autowired
    private ConsulenteRepository consulenteRepository;

    @Autowired
    private mapperAdvanceClass<ConsulenteDTO, Consulente> mapperclass;


    //this motherfucker was very difficult to write...
    public Iterable<SearchResultDTO> findByCityAndCategory(SearchDTO searchDTO){
        //aggiungere i filtri per la ricerca allo stream
        int indexNumber = 0;
        List<SearchResultDTO> searchResultDTOS = new ArrayList<>();
        List<String> words = Arrays.stream(searchDTO.getWord().toLowerCase().split(" ")).toList();
        List<ConsulenteDTO> freelancerInExample = mapperclass.toDTOList(consulenteRepository.FindByCity(searchDTO.getCity())).stream()
            .filter( x -> x.getExperiences()
                .contains(searchDTO.getCategory()))
            .toList();
        for (ConsulenteDTO c: freelancerInExample) {
            for (Experience experiences : c.getExperiences()) {
                    List<String> experiencesWords = Arrays.stream(experiences.getDescription().split(" ")).toList();
                    for(String e : experiencesWords){
                        if (words.contains(e)){
                            indexNumber = indexNumber+ 1;
                        }

                    }
                }
            searchResultDTOS.add( new SearchResultDTO(c,indexNumber));
            indexNumber = 0;
            }
        //when we will have filters for the applications search we will apply them.
        return searchResultDTOS;
        }

//            .stream()
//            .filter(x -> x
//                .getExperiences()
//                .stream()
//                .filter(y -> y.getDescription()
//                    .contains(words))
//            ).toList();

    }


