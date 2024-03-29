package it.shoppingtools.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;


@Data
@Document
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Colloquio {
    @Id
    private String id;
    private String name;
    private LocalDate date;
    private LocalTime schedule;
    private boolean positive;
}
