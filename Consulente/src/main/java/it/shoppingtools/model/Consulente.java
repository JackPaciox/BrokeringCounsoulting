package it.shoppingtools.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;


@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Consulente {

    @Id
    private long id;
    private String name;
    private String surname;
    private String IvaAddress;
    private List<Experience> experiences;
    private boolean avaible;
    private LocalDate birthYear;
    private String introduction;


}
