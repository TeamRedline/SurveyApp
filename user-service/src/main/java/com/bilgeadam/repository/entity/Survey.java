package com.bilgeadam.repository.entity;

import javax.persistence.*;

@Entity
public class Survey {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@ManyToOne
	Course course;
	long sequenceNumber;
	long startTime;
	long finishTime;
	long templateId;

}
