package com.quiz.innobyte.repository;

import com.quiz.innobyte.model.UserQuizAttempt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserQuizAttemptRepository extends JpaRepository<UserQuizAttempt, Long> {
    List<UserQuizAttempt> findByUserId(Long userId);
}
