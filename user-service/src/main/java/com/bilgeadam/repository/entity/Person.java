package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@MappedSuperclass
public class Person {

	@Embedded
	private Name personName;
	@Enumerated(value = EnumType.STRING)
	private Role role;

	private String email;

	private String password;
	@Embedded
	private Address address;

}
