package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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
	String description;
	String text;
	String title;
	long createdDate;
	long finishTime;
	boolean isDraft;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "surveyTemplates")
	@ToString.Exclude
	@JsonIgnore
	List<Question> questions = new ArrayList<>();
	@OneToOne
	private Survey survey;

}
