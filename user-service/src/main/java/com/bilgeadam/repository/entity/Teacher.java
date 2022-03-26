package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder(toBuilder = true)
public class Teacher extends Employee {
	@Id
	long id;
	@ManyToOne(cascade = CascadeType.ALL)
	private Manager manager;
	private int yearsOfExperiance;
	@OneToMany(mappedBy = "masterTrainer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Course> course = new ArrayList<>();

}
