package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, Long> {
	Optional<Teacher> findBy();
}
