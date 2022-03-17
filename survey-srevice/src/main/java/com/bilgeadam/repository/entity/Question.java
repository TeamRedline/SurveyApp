package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String text;
	String title;
	@ManyToOne
	@JsonIgnoreProperties("question")
	QuestionType questionType;
	@OneToMany(mappedBy = "question")
	@JsonIgnoreProperties("question")
	List<StudentAnswer> answer;
	@ManyToMany
	@JsonIgnoreProperties("questions")
	List<SurveyTemplate> surveyTemplates;

}
