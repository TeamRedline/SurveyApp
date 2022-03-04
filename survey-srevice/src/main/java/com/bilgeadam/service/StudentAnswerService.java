package com.bilgeadam.service;

import com.bilgeadam.repository.QuestionRepository;
import com.bilgeadam.repository.StudentAnswerRepository;
import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.repository.entity.StudentAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentAnswerService {

    @Autowired
    StudentAnswerRepository studentAnswerRepository;

    public void createQuestion(StudentAnswer studentAnswer) {

        studentAnswerRepository.save(studentAnswer);
    }

}
