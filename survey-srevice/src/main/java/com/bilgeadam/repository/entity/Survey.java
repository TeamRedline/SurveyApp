package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

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


}
