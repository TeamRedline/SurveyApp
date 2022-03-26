package com.bilgeadam.controller;

import com.bilgeadam.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@CrossOrigin(origins = "*")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	//    @PostMapping("/save")
	//    public void createQuestion(@RequestBody Question question) {
	//        questionService.createQuestion(question);
	//    }

}
