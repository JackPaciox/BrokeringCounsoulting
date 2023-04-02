package it.shoppingtools.controller;

import it.shoppingtools.dto.ExperienceDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/previousexperience")
public class PreviousExperienceController extends AbstractController<ExperienceDTO> {

}