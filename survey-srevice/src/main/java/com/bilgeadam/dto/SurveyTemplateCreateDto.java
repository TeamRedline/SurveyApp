package com.bilgeadam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document

public class SurveyTemplateCreateDto {
	@Id
	String id;
	String description;
	boolean isDraft;
	List<QuestionRequestDto> questions;
	String title;
	String templateCode;
	String text;
	int version;
	long createdDate;
	long finishTime;

}
