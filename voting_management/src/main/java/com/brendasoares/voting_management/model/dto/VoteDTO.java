package com.brendasoares.voting_management.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;


@Getter
public class VoteDTO {

    @NotNull
    private Boolean choice;

    @NotNull
    private Long idAssociate;

    @NotNull
    private Long idVotingsession;
}
