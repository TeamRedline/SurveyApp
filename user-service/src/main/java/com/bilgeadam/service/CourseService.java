package com.bilgeadam.service;

import com.bilgeadam.mapper.RequestMapper;
import com.bilgeadam.repository.CourseRepository;
import com.bilgeadam.repository.entity.Course;
import com.bilgeadam.request.CourseResquestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class CourseService {

	private final CourseRepository repository;
	private final RequestMapper mapper;

	public Course createCourse(CourseResquestDto dto) {

		return repository.save(mapper.toCourse(dto));
	}

	public List<Course> getbyStudent(String name) {

		return repository.findByStudent(name);
	}

	public Course updateCourse(Course course) {
		return repository.save(course);
	}

	public List<Course> getAll() {
		return repository.findAll();
	}

	public List<Course> getByTeacherName(String name) {
		return repository.findByMasterTrainer(name);
	}

	public Optional<Course> getById(Long id) {
		return repository.findById(id);
	}

	public Course findByName(String name) {
		return repository.findByName(name);
	}
}
