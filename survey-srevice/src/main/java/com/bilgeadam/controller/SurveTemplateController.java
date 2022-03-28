package com.bilgeadam.controller;

import com.bilgeadam.dto.SurveyTemplateCreateDto;
import com.bilgeadam.map.QuestionMap;
import com.bilgeadam.repository.SurveyTemplatePostgreRepository;
import com.bilgeadam.repository.SurveyTemplateRepository;
import com.bilgeadam.repository.entity.SurveyTemplate;
import com.bilgeadam.service.SurveyTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class SurveTemplateController {

	@Autowired
	SurveyTemplateRepository repository;
	@Autowired
	SurveyTemplateService service;
	final QuestionMap map;
	@Autowired
	SurveyTemplatePostgreRepository templatePostgreRepository;

	@CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/save")
	public SurveyTemplateCreateDto create(@RequestBody SurveyTemplateCreateDto dto) {
		service.createTemplate(dto);

		return repository.save(dto);
	}

	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getall")
	public Page<SurveyTemplateCreateDto> getAll(Pageable page) {

		return repository.findAll(page);
	}

	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getById")
	public Optional<SurveyTemplateCreateDto> getById(@RequestParam String id) {

		return repository.findById(id);
	}

	@DeleteMapping("/delete")
	public void deleteById(@RequestParam String id) {

		repository.deleteById(id);
	}

	@PutMapping("/update")
	public SurveyTemplateCreateDto update(@RequestParam String id, @RequestBody SurveyTemplateCreateDto dto) {

		Optional<SurveyTemplateCreateDto> surveyTemplateCreateDto = repository.findById(id);
		if (surveyTemplateCreateDto.isPresent()) {
			surveyTemplateCreateDto.get().setCreatedDate(dto.getCreatedDate());
			surveyTemplateCreateDto.get().setVersion(dto.getVersion() + 1);
			surveyTemplateCreateDto.get().setDescription(dto.getDescription());
			surveyTemplateCreateDto.get().setDraft(dto.isDraft());
			surveyTemplateCreateDto.get().setTitle(dto.getTitle());
			surveyTemplateCreateDto.get().setText(dto.getText());

			System.out.println(dto);
			return repository.save(surveyTemplateCreateDto.get());

		}
		return null;
	}

	@GetMapping("/findbytitle")
	public SurveyTemplateCreateDto findByTitle(@RequestParam String title) {

		return repository.findByTitle(title);
	}

	@GetMapping("/findall")
	public Page<SurveyTemplate> findall(Pageable page) {

		return templatePostgreRepository.findAll(page);
	}
}
