package com.bilgeadam.repository.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@Data
public class Manager extends Employee {
	@Id
	//	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;

}
