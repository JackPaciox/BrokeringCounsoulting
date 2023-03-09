package it.shoppingtools.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnnuncioDTO {

    @Id
    private long id;

    private String name;

    private String description;

    private String retribuzione;

    private LocalDate date_of_start;

    private LocalDate date_of_end;

    private String benefits;

}
