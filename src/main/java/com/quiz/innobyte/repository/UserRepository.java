package com.quiz.innobyte.repository;

import com.quiz.innobyte.model.QuizUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<QuizUser, Long> {
    Optional<QuizUser> findByUserName(String username);
}
