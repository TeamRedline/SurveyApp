package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
	private String name;

	@ManyToOne
	@JoinColumn(name = "master_trainer_id")
	private Teacher masterTrainer;

	@ManyToOne
	@JoinColumn(name = "assistant_trainer_id")
	private Teacher assistantTrainer;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "courses")
	@JsonIgnore
	private List<Student> student = new ArrayList<>();

}
