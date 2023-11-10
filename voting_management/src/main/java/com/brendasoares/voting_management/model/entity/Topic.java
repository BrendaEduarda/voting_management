package com.brendasoares.voting_management.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Entity
@Getter
@Setter
@NoArgsConstructor

public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    @NotNull
    private String title;

    @Column(name = "description")
    private String description;

    @OneToOne(mappedBy = "topic")
    private VotingSession votingSession;

    public Topic(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
