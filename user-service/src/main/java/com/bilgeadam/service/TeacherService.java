package com.bilgeadam.service;

import com.bilgeadam.mapper.TeacherMapper;
import com.bilgeadam.repository.TeacherRepository;
import com.bilgeadam.repository.entity.Course;
import com.bilgeadam.repository.entity.Teacher;
import com.bilgeadam.request.TeacherRequestDto;
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

	public Teacher cerateTeacher(TeacherRequestDto dto) {
		//		Address address = Address.builder().street(dto.getStreet()).city(dto.getCity()).country(dto.getCountry())
		//								 .zipCode(dto.getZipCode()).build();

		Teacher teacher = mapper.toTeacher(dto);
		//		teacher.setPersonName(dto.getPersonName());
		//		teacher.setAddress(address);
		//		teacher.setEmail(dto.getEmail());
		//		teacher.setRole(dto.getRole());
		teacherRepository.save(teacher);
		Optional<Course> course = courseService.getById(dto.getCourseId());
		if (course.isPresent()) {
			course.get().setMasterTrainer(teacher);
			courseService.updateCourse(course.get());

		}
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
