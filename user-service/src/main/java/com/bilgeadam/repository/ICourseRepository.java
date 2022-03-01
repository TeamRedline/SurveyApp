package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course, Long> {
}
