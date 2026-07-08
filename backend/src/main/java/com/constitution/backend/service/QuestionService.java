package com.constitution.backend.service;

import com.constitution.backend.entity.Question;
import com.constitution.backend.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
    public Question updateQuestion(Long id, Question updatedQuestion) {

    Question question = questionRepository.findById(id).orElseThrow();

    question.setQuestion(updatedQuestion.getQuestion());
    question.setOptionA(updatedQuestion.getOptionA());
    question.setOptionB(updatedQuestion.getOptionB());
    question.setOptionC(updatedQuestion.getOptionC());
    question.setOptionD(updatedQuestion.getOptionD());
    question.setCorrectAnswer(updatedQuestion.getCorrectAnswer());
    question.setExplanation(updatedQuestion.getExplanation());
    question.setDifficulty(updatedQuestion.getDifficulty());
    question.setCategory(updatedQuestion.getCategory());

    return questionRepository.save(question);
}

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepository.findByCategory(category);
    }

    public List<Question> getQuestionsByDifficulty(String difficulty) {
        return questionRepository.findByDifficulty(difficulty);
    }

    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}