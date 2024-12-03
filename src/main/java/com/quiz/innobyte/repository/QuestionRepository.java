package com.quiz.innobyte.repository;

import com.quiz.innobyte.model.Questions;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Questions, Long> {
    List<Questions> findByQuizId(Long quizId);
}
