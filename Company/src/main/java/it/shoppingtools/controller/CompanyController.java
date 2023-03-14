package it.shoppingtools.controller;

import it.shoppingtools.dto.CompanyDTO;
import it.shoppingtools.model.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/company")
public class CompanyController extends AbstractController<CompanyDTO> {
}