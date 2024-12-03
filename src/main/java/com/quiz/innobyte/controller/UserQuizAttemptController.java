package com.quiz.innobyte.controller;

import com.quiz.innobyte.model.UserQuizAttempt;
import com.quiz.innobyte.service.UserQuizAttemptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attempts")
public class UserQuizAttemptController {

    @Autowired
    private UserQuizAttemptService userQuizAttemptService;

    @PostMapping("/submit")
    public ResponseEntity<UserQuizAttempt> submitQuizAttempt(@RequestBody UserQuizAttempt attempt) {
        UserQuizAttempt submittedAttempt = userQuizAttemptService.saveAttempt(attempt);
        return new ResponseEntity<>(submittedAttempt, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<UserQuizAttempt>> getUserAttempts(@PathVariable Long userId) {
        List<UserQuizAttempt> attempts = userQuizAttemptService.getAttemptsByUser(userId);
        return new ResponseEntity<>(attempts, HttpStatus.OK);
    }
}
