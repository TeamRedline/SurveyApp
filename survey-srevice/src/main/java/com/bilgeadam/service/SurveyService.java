package com.bilgeadam.service;

import com.bilgeadam.repository.SurveyRepository;
import com.bilgeadam.repository.entity.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {

	@Autowired
	SurveyRepository surveyRepository;

	public Survey createSurvey(Survey survey) {

		return surveyRepository.save(survey);
	}

	public List<Survey> getSurveys() {

		return surveyRepository.findAll();
	}

	public Survey getbySurveyId(long id) {

		return surveyRepository.getById(id);
	}

}
