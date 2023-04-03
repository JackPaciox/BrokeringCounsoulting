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
    private String id;
    private LocalDate start;
    private LocalDate end;
    private String nameCompany;
    private CategoryDTO categoryDTO;
    private String roleDescription;
    private String Description;
}
