package com.bilgeadam.repository.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class StudentAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "survey_id")
    Survey survey;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    Question question;
    long timestamp;
    boolean isFinished;
    String answer;


}
