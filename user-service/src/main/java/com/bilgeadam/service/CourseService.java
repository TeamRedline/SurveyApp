package com.bilgeadam.service;

import com.bilgeadam.mapper.RequestMapper;
import com.bilgeadam.repository.ICourseRepository;
import com.bilgeadam.repository.entity.Course;
import com.bilgeadam.request.CourseResquestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CourseService {

	private final ICourseRepository repository;
	private final RequestMapper mapper;

	public Course createCourse(CourseResquestDto dto) {

		return repository.save(mapper.toCourse(dto));
	}
}
