package it.shoppingtools.controller;

import it.shoppingtools.dto.AnnuncioDTO;
import it.shoppingtools.dto.ColloquioDTO;
import it.shoppingtools.model.Colloquio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/colloquio")
public class ColloquioController extends AbstractController<ColloquioDTO> {
}