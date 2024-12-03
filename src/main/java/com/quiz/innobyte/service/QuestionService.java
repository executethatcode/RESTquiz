package com.quiz.innobyte.service;

import com.quiz.innobyte.model.Questions;
import com.quiz.innobyte.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    public Questions addQuestion(Questions question) {
        Questions addedQuestion = questionRepository.save(question);
        return addedQuestion;
    }

    public List<Questions> getQuestionsByQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
