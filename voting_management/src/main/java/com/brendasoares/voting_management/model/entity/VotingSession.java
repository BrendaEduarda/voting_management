package com.brendasoares.voting_management.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class VotingSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Topic topic;

    @OneToMany(mappedBy = "votingSession")
    private List<Vote> votes;

    public VotingSession(Topic topic) {
        this.topic = topic;
    }
}
