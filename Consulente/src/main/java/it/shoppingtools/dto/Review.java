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

    private String id;
    private String jobRole;
    private String Description;
    private Long userId;

    //the valuation should be from 1 to 5
    private Valuation valuation;


    public enum Valuation{
        Uncomplited,

        BadDone,

        Done,

        WellDone,

        VeryWellDone
    }
}
