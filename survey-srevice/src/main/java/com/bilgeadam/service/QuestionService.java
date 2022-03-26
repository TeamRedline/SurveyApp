package com.bilgeadam.service;

import com.bilgeadam.dto.QuestionRequestDto;
import com.bilgeadam.map.QuestionMap;
import com.bilgeadam.repository.QuestionRepository;
import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.repository.entity.SurveyTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

	final QuestionRepository questionRepository;
	final QuestionMap questionMap;

	public void createQuestion(List<QuestionRequestDto> questions, SurveyTemplate survey) {

		questions.stream().forEach(line -> {
			Question question = questionMap.toQuestion(line);
			question.getSurveyTemplate().add(survey);
			questionRepository.save(question);
		});

	}

}
