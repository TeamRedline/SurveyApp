package com.bilgeadam.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CourseResquestDto {

	private String name;
	private String assitantTrainerName;
	private String masterTrainerName;

	long createdDate;
	long finishDate;
}
