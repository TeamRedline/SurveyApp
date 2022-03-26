package com.bilgeadam.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder
@Data
public class Survey {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@OneToOne
	@JsonIgnore
	private SurveyTemplate template;
	long courseid;
	long sequenceNumber;
	Date startTime;
	Date finishTime;
	String templateUId;

}
