package com.bilgeadam.repository.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class StudentAnswer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@ManyToOne
	Question question;
	long timestamp;
	boolean isFinished;
	String answer;

}
