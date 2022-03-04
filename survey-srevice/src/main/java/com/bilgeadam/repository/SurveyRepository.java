package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.repository.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey,Long> {

}
