package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Course;
import com.bilgeadam.request.CourseResquestDto;
import com.bilgeadam.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CourseController {

	private final CourseService service;

	@PostMapping()
	public Course createCourse(@RequestBody CourseResquestDto course) {
		return service.createCourse(course);
	}

	@CrossOrigin(origins = "http://localhost:8082")
	@GetMapping("/getall")
	public List<Course> getAll() {
		return service.getAll();
	}

	@CrossOrigin(origins = "http://localhost:8082")
	@GetMapping("/id")
	public Optional<Course> getAll(@RequestParam Long id) {
		return service.getById(id);
	}

	@GetMapping("/getStudentname")
	public List<Course> getStudentName(@RequestParam String name) {
		return service.getbyStudent(name);
	}

	@GetMapping("/getTeachername")
	public List<Course> getbyId(@RequestParam String name) {
		return service.getByTeacherName(name);
	}

	@CrossOrigin(origins = "http://localhost:8082")
	@GetMapping("/findbyname")
	public Course getbyName(@RequestParam String name) {
		return service.findByName(name);
	}
}
