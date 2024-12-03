package com.quiz.innobyte.controller;

import com.quiz.innobyte.model.Quiz;
import com.quiz.innobyte.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
    @Autowired
    QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<Quiz> createQuiz(@RequestBody Quiz quiz) {
        Quiz createdQuiz = quizService.createQuiz(quiz);
        return new ResponseEntity<>(createdQuiz, HttpStatus.OK);
    }

    @GetMapping("/getAllQuiz")
    public ResponseEntity<List<Quiz>> getAllQuiz() {
        List<Quiz> quizzes = quizService.getAllQuizzes();
        return new ResponseEntity<>(quizzes, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteQuiz(@PathVariable long id) {
        quizService.deleteQuiz(id);
        return new ResponseEntity<>("Quiz deleted", HttpStatus.OK);
    }
}
