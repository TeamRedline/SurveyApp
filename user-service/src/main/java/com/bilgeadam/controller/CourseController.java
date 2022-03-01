package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Course;
import com.bilgeadam.request.CourseResquestDto;
import com.bilgeadam.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

	private final CourseService service;

	@PostMapping()
	public Course createCourse(@RequestBody CourseResquestDto course) {

		return service.createCourse(course);
	}
}
