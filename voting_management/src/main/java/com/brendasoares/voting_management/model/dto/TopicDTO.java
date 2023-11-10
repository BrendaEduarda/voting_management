package com.brendasoares.voting_management.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TopicDTO {

    @NotNull
    private String title;

    private String description;
}
