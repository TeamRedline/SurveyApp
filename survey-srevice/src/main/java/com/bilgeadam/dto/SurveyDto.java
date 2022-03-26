package com.bilgeadam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SurveyDto {

	long id;
	private SurveyTemplateCreateDto template;
	long courseid;
	long sequenceNumber;
	Date startTime;
	Date finishTime;
	String templateUId;
}
