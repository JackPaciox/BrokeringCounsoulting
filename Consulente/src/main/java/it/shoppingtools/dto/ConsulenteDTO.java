package it.shoppingtools.dto;

import it.shoppingtools.model.Experience;
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
public class ConsulenteDTO {

    private String id;
    private String name;
    private String surname;
    private String IvaAddress;
    private List<Experience> experiences;
    private boolean avaible;
    private LocalDate birthYear;
    private String introduction;


}
