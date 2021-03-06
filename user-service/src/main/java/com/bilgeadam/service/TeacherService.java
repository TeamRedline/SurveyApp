package com.bilgeadam.service;

import com.bilgeadam.manager.AuthManager;
import com.bilgeadam.mapper.TeacherMapper;
import com.bilgeadam.repository.TeacherRepository;
import com.bilgeadam.repository.entity.Course;
import com.bilgeadam.repository.entity.Teacher;
import com.bilgeadam.request.TeacherRequestDto;
import com.bilgeadam.request.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeacherService {

	private final TeacherRepository teacherRepository;
	private final TeacherMapper mapper;
	private final CourseService courseService;
	private final AuthManager authManager;

	public Teacher cerateTeacher(TeacherRequestDto dto) {
		//		Address address = Address.builder().street(dto.getStreet()).city(dto.getCity()).country(dto.getCountry())
		//								 .zipCode(dto.getZipCode()).build();

		Teacher teacher = mapper.toTeacher(dto);
		//		teacher.setPersonName(dto.getPersonName());
		//		teacher.setAddress(address);
		//		teacher.setEmail(dto.getEmail());
		//		teacher.setRole(dto.getRole());
		Teacher teacherToSend = teacherRepository.save(teacher);
		Optional<Course> course = courseService.getById(dto.getCourseId());
		if (course.isPresent()) {
			course.get().setMasterTrainer(teacher);
			courseService.updateCourse(course.get());

		}
		UserRequestDto requestDto = new UserRequestDto(teacherToSend.getEmail(),teacherToSend.getPassword(),teacherToSend.getId());
		authManager.createUser(requestDto);
		return teacher;
	}

	public List<Teacher> getAll() {
		return teacherRepository.findAll();
	}

	public List<Teacher> getByCourseName(String name) {
		Course course = courseService.findByName(name);
		return teacherRepository.findByCourse(course);
	}

	public Optional<Teacher> getById(Long id) {
		return teacherRepository.findById(id);
	}
}
