package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
