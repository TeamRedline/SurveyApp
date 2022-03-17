package com.bilgeadam.repository.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class QuestionType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String name;
	String description;
	@OneToMany(mappedBy = "questionType")
	private List<Question> questions;

}
