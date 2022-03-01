package com.bilgeadam.request;

import com.bilgeadam.repository.entity.Address;
import com.bilgeadam.repository.entity.Name;
import com.bilgeadam.repository.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherRequestDto extends PersonRequestDto {

	private long courseId;
	private long managerId;

	public TeacherRequestDto(Name personName, Role role, String email, String password, Address address, long courseId,
			long managerId) {
		super(personName, role, email, password, address);
		this.courseId = courseId;
		this.managerId = managerId;
	}
}
