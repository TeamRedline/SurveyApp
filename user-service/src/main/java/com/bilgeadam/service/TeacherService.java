package com.bilgeadam.service;

import com.bilgeadam.mapper.TeacherMapper;
import com.bilgeadam.repository.ITeacherRepository;
import com.bilgeadam.repository.entity.Teacher;
import com.bilgeadam.request.TeacherRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherService {

	private final ITeacherRepository teacherRepository;
	private final TeacherMapper mapper;

	public Teacher cerateTeacher(TeacherRequestDto dto) {
		//		Address address = Address.builder().street(dto.getStreet()).city(dto.getCity()).country(dto.getCountry())
		//								 .zipCode(dto.getZipCode()).build();

		Teacher teacher = mapper.toTeacher(dto);
		//		teacher.setPersonName(dto.getPersonName());
		//		teacher.setAddress(address);
		//		teacher.setEmail(dto.getEmail());
		//		teacher.setRole(dto.getRole());

		return teacherRepository.save(teacher);

	}

}
