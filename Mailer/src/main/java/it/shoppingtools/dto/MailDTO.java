package it.shoppingtools.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class MailDTO {

    @Id
    private long id;
    private String email;

    private String object;

    private String message;

    private String UUID;
}
