package com.raisetech.cruddemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Team {
    private int id;

    private String name;

    private String league;

    private int foundingYear;

}
