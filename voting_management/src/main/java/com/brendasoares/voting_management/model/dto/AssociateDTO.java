package com.brendasoares.voting_management.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssociateDTO {

    @NotNull
    private String userName;
}
