package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@CrossOrigin(origins = "*")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	//    @PostMapping("/save")
	//    public void createQuestion(@RequestBody Question question) {
	//        questionService.createQuestion(question);
	//    }
	@GetMapping("/all")
	public List<Question> getAll() {
		return questionService.getAll();
	}

	@GetMapping("/findbytemplate")
	public List<Question> findBySurveyTempalte(@RequestParam long id) {
		return questionService.findBySurveyTemplate(id);
	}

}
