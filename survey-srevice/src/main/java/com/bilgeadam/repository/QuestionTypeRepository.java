package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.repository.entity.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionTypeRepository extends JpaRepository<QuestionType,Long> {

}
