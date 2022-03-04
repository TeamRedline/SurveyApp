package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @PostMapping("/save")
    public void createQuestion(@RequestBody Question question) {
        questionService.createQuestion(question);
    }

}
