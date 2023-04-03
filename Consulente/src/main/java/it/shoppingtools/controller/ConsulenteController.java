package it.shoppingtools.controller;

import it.shoppingtools.dto.ConsulenteDTO;
import it.shoppingtools.dto.SearchDTO;
import it.shoppingtools.dto.SearchResultDTO;
import it.shoppingtools.service.SearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/Consulente")
public class ConsulenteController extends AbstractController<ConsulenteDTO> {

    @Autowired
    private SearchService searchService;

    @PostMapping("/search")
    public Iterable<SearchResultDTO> search(@RequestBody SearchDTO search){
        return searchService.findByCityAndCategory(search);
    }
}