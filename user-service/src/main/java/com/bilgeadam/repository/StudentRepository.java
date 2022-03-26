package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByCourse(String courseName);
}
