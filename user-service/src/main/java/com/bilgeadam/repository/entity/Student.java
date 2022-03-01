package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder(toBuilder = true)
public class Student extends Person {
	@Id
	//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	private String studentNumber = UUID.randomUUID().toString();
	private long registredDate;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinTable(name = "stu_course", joinColumns = { @JoinColumn(name = "stu_id") },
			   inverseJoinColumns = { @JoinColumn(name = "course_id") })
	private List<Course> courses = new ArrayList<>();

}
