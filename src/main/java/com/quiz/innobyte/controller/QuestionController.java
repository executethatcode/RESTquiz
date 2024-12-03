package com.quiz.innobyte.controller;

import com.quiz.innobyte.model.Questions;
import com.quiz.innobyte.service.QuestionService;
import com.sun.net.httpserver.HttpsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/add")
    public ResponseEntity<Questions> addQuestion(@RequestBody Questions question) {
        Questions createdQuestion = questionService.addQuestion(question);
        return new ResponseEntity<>(createdQuestion, HttpStatus.OK);
    }

    @GetMapping("/getQuestions/{quizId}")
    public ResponseEntity<List<Questions>> getQuestionsByQuiz(@PathVariable Long quizId) {
        List<Questions> questions = questionService.getQuestionsByQuiz(quizId);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }
}
