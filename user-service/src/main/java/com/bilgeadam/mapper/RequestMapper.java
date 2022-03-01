package com.bilgeadam.mapper;

import com.bilgeadam.repository.entity.Course;
import com.bilgeadam.request.CourseResquestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RequestMapper {
	Course toCourse(CourseResquestDto dto);
}
