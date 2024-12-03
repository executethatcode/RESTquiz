package com.quiz.innobyte.service;

import com.quiz.innobyte.model.UserQuizAttempt;
import com.quiz.innobyte.repository.UserQuizAttemptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserQuizAttemptService {
    @Autowired
    UserQuizAttemptRepository userQuizAttemptRepository;

    public UserQuizAttempt saveAttempt(UserQuizAttempt attempt) {
        return userQuizAttemptRepository.save(attempt);
    }

    public List<UserQuizAttempt> getAttemptsByUser(Long userId) {
        return userQuizAttemptRepository.findByUserId(userId);
    }
}
