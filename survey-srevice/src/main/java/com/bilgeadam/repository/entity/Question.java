package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String text;

    @OneToOne
    @JsonIgnoreProperties("question")
    QuestionType type;
    @OneToMany(mappedBy = "question")
    @JsonIgnoreProperties()
    List<StudentAnswer> answer;
    @ManyToMany
    @JsonIgnoreProperties("questions")
    List<SurveyTemplate> surveyTemplates;



}
