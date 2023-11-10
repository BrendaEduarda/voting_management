package com.brendasoares.voting_management.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Associate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "user_name")
    @NotNull
    private String userName;

    @OneToMany(mappedBy = "associate")
    private List<Vote> votes;

    public Associate(String userName) {
        this.userName = userName;
    }
}
