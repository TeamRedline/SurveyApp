package com.bilgeadam.repository.entity;

import javax.persistence.*;

@Entity
public class Teacher extends Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "managerId")
	private Manager manager;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "courseId")
	private Course course;
	private int yearsOfExperiance;

}
