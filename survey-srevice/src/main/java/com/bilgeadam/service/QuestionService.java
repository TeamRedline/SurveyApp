package com.bilgeadam.service;

import com.bilgeadam.repository.QuestionRepository;
import com.bilgeadam.repository.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public void createQuestion(Question question) {

        questionRepository.save(question);
    }

}
