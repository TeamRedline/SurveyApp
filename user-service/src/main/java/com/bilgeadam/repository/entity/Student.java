package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student extends Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String studentNumber = UUID.randomUUID().toString();
	private long registredDate;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "stu_course", joinColumns = { @JoinColumn(name = "stu_id") },
			   inverseJoinColumns = { @JoinColumn(name = "course_id") })
	private List<Course> courses = new ArrayList<>();

}
