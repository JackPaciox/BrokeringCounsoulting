package it.shoppingtools.controller;

import it.shoppingtools.service.AdvancedServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public abstract class AbstractControllerAdvace<DTO> extends AbstractController<DTO>{

    private AdvancedServiceDTO advancedServiceDTO;

    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<Iterable<DTO>>((Iterable<DTO>) advancedServiceDTO.getAll(), HttpStatus.OK);
    }

}
