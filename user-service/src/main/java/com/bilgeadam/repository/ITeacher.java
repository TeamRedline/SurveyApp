package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ITeacher extends JpaRepository<Teacher,Long> {
    Optional<Teacher> findBy();
}
