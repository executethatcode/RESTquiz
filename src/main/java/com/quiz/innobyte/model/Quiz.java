package com.quiz.innobyte.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String title;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private Set<Questions> questions;

}
