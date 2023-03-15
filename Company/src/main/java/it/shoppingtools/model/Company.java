package it.shoppingtools.model;

import it.shoppingtools.dto.Consulente;
import it.shoppingtools.dto.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@Document
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    private String nome;
    private String ivaAddress;
    private String Description;
    private Long userId;
    //the valuation should be from 1 to 5

    @OneToMany
    private List<Annuncio> annuncios;

    //array semplica

    private List<Consulente> consulenteList;
    private List<Review> reviews;
    private LocalDate fundation;

}
