package com.raisetech.cruddemo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class CreateForm {

    private int id;

    @NotBlank
    private String name;

    @NotBlank
    private String league;

    @NotNull
    private int foundingYear;
}

