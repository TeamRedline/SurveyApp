package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
