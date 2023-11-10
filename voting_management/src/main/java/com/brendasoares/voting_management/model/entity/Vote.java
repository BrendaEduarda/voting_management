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
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotNull
    private Boolean choice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "associate")
    @NotNull
    private Associate associate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voting_session")
    @NotNull
    private VotingSession votingSession;

    public Vote(Boolean choice, Associate foundAssociate, VotingSession foundVotingSession) {
        this.choice = choice;
        this.associate = foundAssociate;
        this.votingSession = foundVotingSession;
    }
}
