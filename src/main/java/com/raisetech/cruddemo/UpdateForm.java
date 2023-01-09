package com.raisetech.cruddemo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UpdateForm {
    private int id;

    @NotBlank
    private String name;

    @NotBlank
    private String league;

    @NotNull
    private int foundingYear;
}
