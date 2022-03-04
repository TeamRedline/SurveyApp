package com.bilgeadam.service;

import com.bilgeadam.repository.QuestionRepository;
import com.bilgeadam.repository.QuestionTypeRepository;
import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.repository.entity.QuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionTypeService {

    @Autowired
    QuestionTypeRepository questionTypeRepository;

    public void createQuestion(QuestionType questionType) {

        questionTypeRepository.save(questionType);
    }

}
