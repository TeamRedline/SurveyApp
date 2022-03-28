package com.bilgeadam.service;

import com.bilgeadam.dto.QuestionRequestDto;
import com.bilgeadam.map.QuestionMap;
import com.bilgeadam.repository.QuestionRepository;
import com.bilgeadam.repository.SurveyTemplatePostgreRepository;
import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.repository.entity.SurveyTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {

	final QuestionRepository questionRepository;
	final QuestionMap questionMap;
	final SurveyTemplatePostgreRepository templateService;

	public void createQuestion(List<QuestionRequestDto> questions, SurveyTemplate survey) {

		questions.stream().forEach(line -> {
			Question question = questionMap.toQuestion(line);
			question.getSurveyTemplate().add(survey);
			questionRepository.save(question);
		});

	}

	public List<Question> getAll() {

		return questionRepository.findAll();

	}

	public List<Question> findBySurveyTemplate(Long id) {
		Optional<SurveyTemplate> survey = templateService.findById(id);
		return survey.get().getQuestions();

	}
}