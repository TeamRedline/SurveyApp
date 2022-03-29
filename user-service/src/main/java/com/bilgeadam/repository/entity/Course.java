package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	long id;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "course")
	@JsonIgnore
	List<Survey> survey;
	private String name;
	@ManyToOne
	@ToString.Exclude
	private Teacher masterTrainer;
	//	@ManyToOne
	//	@JoinColumn(name = "assistant_trainer_id")
	//	private Teacher assistantTrainer;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "course")
	@JsonIgnore
	private List<Student> student = new ArrayList<>();

}
