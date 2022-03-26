package com.bilgeadam.service;

import com.bilgeadam.repository.StudentRepository;
import com.bilgeadam.repository.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
	private final StudentRepository studentRepository;

	public Student create(Student student) {

		return studentRepository.save(student);

	}

	public List<Student> getAll() {

		return studentRepository.findAll();
	}

	public List<Student> getbyCouseName(String name) {

		return studentRepository.findByCourse(name);

	}

}
