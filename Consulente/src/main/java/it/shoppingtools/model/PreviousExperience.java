package it.shoppingtools.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class PreviousExperience {
    @Id
    private String id;
    private LocalDate start;
    private LocalDate end;
    private String nameCompany;
    private String role;
    private String Description;
}
