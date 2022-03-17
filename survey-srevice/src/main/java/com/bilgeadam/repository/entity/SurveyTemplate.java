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
public class SurveyTemplate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String templateCode;
	int version;
	String explanation;
	String title;
	long startTime;
	long finishTime;
	boolean isDraft;
	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "surveyTemplates")
	@JsonIgnoreProperties("surveyTemplates")
	List<Question> questions;
	@OneToOne
	@JsonIgnoreProperties("template")
	private Survey survey;

}
