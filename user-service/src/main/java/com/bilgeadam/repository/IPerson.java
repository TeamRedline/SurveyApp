package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPerson extends JpaRepository<Person, Long> {
}
