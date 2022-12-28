package com.raisetech.cruddemo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Team {
    private int id;

    private String team;

    private String league;

    private int founding_year;

}
