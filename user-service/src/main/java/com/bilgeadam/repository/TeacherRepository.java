package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Course;
import com.bilgeadam.repository.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	List<Teacher> findByCourse(Course course);
}
