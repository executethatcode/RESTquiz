package com.quiz.innobyte.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserQuizAttempt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private int score;
    private Date attemptDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private QuizUser user;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
}
