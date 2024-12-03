package com.quiz.innobyte.service;

import com.quiz.innobyte.model.Quiz;
import com.quiz.innobyte.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;


    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public void deleteQuiz(long id) {
        quizRepository.deleteById(id);
    }
}
