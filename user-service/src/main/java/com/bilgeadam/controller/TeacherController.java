package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Teacher;
import com.bilgeadam.request.TeacherRequestDto;
import com.bilgeadam.service.CourseService;
import com.bilgeadam.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TeacherController {
	private final TeacherService service;
	private final CourseService courseService;

	@CrossOrigin(origins = "http://localhost:8082")
	@PostMapping()
	public Teacher createTeacher(@RequestBody TeacherRequestDto dto) {

		return service.cerateTeacher(dto);

	}

	@CrossOrigin(origins = "http://localhost:8082")
	@GetMapping()
	public List<Teacher> getAll() {
		return service.getAll();
	}

	@GetMapping("/id")
	@CrossOrigin(origins = "http://localhost:8082")
	public Optional<Teacher> getAll(@RequestParam Long id) {
		return service.getById(id);
	}

	@CrossOrigin(origins = "http://localhost:8082")
	@GetMapping("/getbycoursename")
	public List<Teacher> getByCourseName(@RequestParam String name) {
		return service.getByCourseName(name);
	}
}
