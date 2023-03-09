package it.shoppingtools.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    private long id;
    private String jobRole;
    private String Description;
    private Long userId;

    //the valuation should be from 1 to 5
    private int valuation;
}
