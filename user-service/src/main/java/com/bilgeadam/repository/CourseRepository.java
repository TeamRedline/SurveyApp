package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

	List<Course> findByStudent(String student);

	List<Course> findByMasterTrainer(String name);

	Course findByName(String name);
}
