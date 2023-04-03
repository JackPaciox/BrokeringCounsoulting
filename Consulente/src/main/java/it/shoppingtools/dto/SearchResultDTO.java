package it.shoppingtools.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SearchResultDTO {
    private ConsulenteDTO consulenteDTOS;
    private int IndexNum;

}
