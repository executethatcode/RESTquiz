package com.quiz.innobyte.repository;

import com.quiz.innobyte.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
