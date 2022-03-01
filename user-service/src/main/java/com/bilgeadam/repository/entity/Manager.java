package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor

@Data
public class Manager extends Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@OneToMany(mappedBy = "manager")
	private List<Teacher> teachers;

}
