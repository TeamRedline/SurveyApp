package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class SurveyTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String templateCode;
    int version;
    String explanation;
    long startTime;
    long finishTime;
    boolean isDraft;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "surveyTemplates")
    @JsonIgnoreProperties("surveyTemplates")
    List<Question> questions;
    @OneToOne
    @JsonIgnoreProperties("template")
    private Survey survey;




}
