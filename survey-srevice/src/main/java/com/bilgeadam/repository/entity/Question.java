package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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
	@JsonIgnore
	@ToString.Exclude
	List<SurveyTemplate> surveyTemplates = new ArrayList<>();

	public List<SurveyTemplate> getSurveyTemplate() {
		if (this.surveyTemplates == null) {
			surveyTemplates = new ArrayList<>();
		}
		return surveyTemplates;
	}

	String types;
}
