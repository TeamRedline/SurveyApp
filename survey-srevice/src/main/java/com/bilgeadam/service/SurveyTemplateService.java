package com.bilgeadam.service;

import com.bilgeadam.repository.QuestionRepository;
import com.bilgeadam.repository.SurveyTemplateRepository;
import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.repository.entity.SurveyTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyTemplateService {

    @Autowired
    SurveyTemplateRepository surveyTemplateRepository;

    public void createQuestion(SurveyTemplate surveyTemplate) {

        surveyTemplateRepository.save(surveyTemplate);
    }

}
