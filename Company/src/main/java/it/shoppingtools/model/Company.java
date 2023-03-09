package it.shoppingtools.model;

import it.shoppingtools.dto.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long nome;
    private String ivaAddress;
    private String Description;
    private Long userId;
    //the valuation should be from 1 to 5
    private List<Annuncio> annuncios;
    private List<Review> reviews;
    private LocalDate fundation;

}
