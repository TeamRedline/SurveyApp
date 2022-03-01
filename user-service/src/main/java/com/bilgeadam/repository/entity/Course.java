package com.bilgeadam.repository.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@OneToMany(mappedBy = "course")
	private List<Teacher> teachers;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "courses")
	private List<Student> student = new ArrayList<>();

}
