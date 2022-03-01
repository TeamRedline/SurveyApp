package com.bilgeadam.request;

import com.bilgeadam.repository.entity.Address;
import com.bilgeadam.repository.entity.Name;
import com.bilgeadam.repository.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PersonRequestDto {

	private Name personName;
	private Role role;
	private String email;
	private String password;
	private Address address;

}
