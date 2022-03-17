package com.bilgeadam.repository;

import com.bilgeadam.dto.SurveyTemplateCreateDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SurveyTemplateRepository extends MongoRepository<SurveyTemplateCreateDto, String> {

}
