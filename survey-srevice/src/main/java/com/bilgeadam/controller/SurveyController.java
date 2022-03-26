package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Survey;
import com.bilgeadam.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SurveyController {

	final SurveyService surveyService;

	@CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/surveycreate")
	public Survey createSurvey(@RequestBody Survey dto) {
		Survey survey = Survey.builder().courseid(dto.getCourseid()).templateUId(dto.getTemplateUId())
							  .sequenceNumber(dto.getSequenceNumber()).build();
		System.out.println(dto);
		return surveyService.createSurvey(survey);
	}

	@GetMapping("/getAllsurvey")
	public List<Survey> getAll() {
		return surveyService.getSurveys();
	}

	@GetMapping("/getAll/id")
	public Survey getAll(@RequestParam long id) {
		return surveyService.getbySurveyId(id);
	}

}
