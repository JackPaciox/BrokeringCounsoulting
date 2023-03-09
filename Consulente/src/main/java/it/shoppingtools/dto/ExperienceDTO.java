package it.shoppingtools.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.time.LocalDate;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDTO {
    @Id
    private long id;
    private LocalDate start;
    private LocalDate end;
    private String nameCompany;
    private String role;
    private String Description;
}
