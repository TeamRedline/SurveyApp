package com.bilgeadam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class QuestionRequestDto {

	long id;
	String text;
	List<String> option;
	String orderNo;
	String title;
	String types;
	String finish;
	String point;
	String start;

}


