package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.repository.entity.StudentAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAnswerRepository extends JpaRepository<StudentAnswer,Long> {

}
