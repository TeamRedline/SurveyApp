package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.SurveyTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyTemplatePostgreRepository extends JpaRepository<SurveyTemplate, Long> {
}
