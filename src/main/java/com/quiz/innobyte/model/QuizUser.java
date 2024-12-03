package com.quiz.innobyte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class QuizUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String userName;
    private String password;
    private String role;

}
