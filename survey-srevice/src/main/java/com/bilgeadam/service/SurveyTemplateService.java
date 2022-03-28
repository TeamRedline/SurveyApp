package com.bilgeadam.service;

import com.bilgeadam.dto.SurveyTemplateCreateDto;
import com.bilgeadam.map.QuestionMap;
import com.bilgeadam.repository.SurveyTemplatePostgreRepository;
import com.bilgeadam.repository.SurveyTemplateRepository;
import com.bilgeadam.repository.entity.SurveyTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SurveyTemplateService {

	final SurveyTemplatePostgreRepository repository;
	final QuestionMap map;
	final QuestionService questionService;
	final SurveyTemplateRepository surveyTemplateRepository;

	public SurveyTemplateCreateDto createTemplate(SurveyTemplateCreateDto dto) {

		SurveyTemplate surveyTemplate = map.toSurveyTamplate(dto);
		System.out.println(dto);
		System.out.println(surveyTemplate);

		repository.save(surveyTemplate);
		questionService.createQuestion(dto.getQuestions(), surveyTemplate);
		System.out.println(surveyTemplate);
		return dto;
	}

	public void deleteTemplate(String id) {
		surveyTemplateRepository.deleteById(id);

	}

	public SurveyTemplateCreateDto getbyTitle(String title) {
		return surveyTemplateRepository.findByTitle(title);

	}

	public Optional<SurveyTemplate> getbyId(Long id) {
		return repository.findById(id);

	}
}
