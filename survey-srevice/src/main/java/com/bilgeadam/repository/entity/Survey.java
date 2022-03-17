package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Survey {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@OneToOne
	@JsonIgnoreProperties("survey")
	private SurveyTemplate template;

	long courseid;
	long sequenceNumber;
	long startTime;
	long finishTime;
	@OneToMany
	List<StudentAnswer> studentAnswers;

}
