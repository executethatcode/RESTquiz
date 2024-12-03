package com.quiz.innobyte.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String questionText;
    private String options;
    private String correctAnswer;

    @ManyToOne
    @JoinColumn(name = "quizz_id")
    private Quiz quiz;
}
