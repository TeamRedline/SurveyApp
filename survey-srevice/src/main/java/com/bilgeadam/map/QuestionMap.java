package com.bilgeadam.map;

import com.bilgeadam.dto.QuestionRequestDto;
import com.bilgeadam.dto.SurveyTemplateCreateDto;
import com.bilgeadam.repository.entity.Question;
import com.bilgeadam.repository.entity.SurveyTemplate;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuestionMap {

	Question toQuestion(QuestionRequestDto dto);

	SurveyTemplate toSurveyTamplate(SurveyTemplateCreateDto dto);

}
