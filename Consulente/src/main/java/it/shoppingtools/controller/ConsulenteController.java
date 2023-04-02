package it.shoppingtools.controller;

import it.shoppingtools.dto.ConsulenteDTO;
import it.shoppingtools.dto.SearchDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/Consulente")
public class ConsulenteController extends AbstractController<ConsulenteDTO> {


    @PostMapping("/search")
    public Iterable<ConsulenteDTO> search(@RequestBody SearchDTO search){

        return null;
    }
}