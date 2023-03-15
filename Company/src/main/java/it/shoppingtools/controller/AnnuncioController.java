package it.shoppingtools.controller;

import it.shoppingtools.dto.AnnuncioDTO;
import it.shoppingtools.model.Annuncio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/Annuncio")
public class AnnuncioController extends AbstractController<AnnuncioDTO> {

}