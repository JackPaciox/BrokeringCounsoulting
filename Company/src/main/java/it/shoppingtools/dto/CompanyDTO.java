package it.shoppingtools.dto;

import it.shoppingtools.model.Annuncio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    private String nome;
    private String ivaAddress;
    private String Description;
    private Long userId;
    //the valuation should be from 1 to 5
    private List <Annuncio> annuncios;
    private List<Review> reviews;
    private LocalDate fundation;

    private List<Consulente> consulenteList;
}
