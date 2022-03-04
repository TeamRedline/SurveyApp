package com.bilgeadam.service;

import com.bilgeadam.repository.QuestionRepository;
import com.bilgeadam.repository.SurveyRepository;
import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.repository.entity.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {

    @Autowired
    SurveyRepository surveyRepository;

    public void createQuestion(Survey survey) {

        surveyRepository.save(survey);
    }

}
