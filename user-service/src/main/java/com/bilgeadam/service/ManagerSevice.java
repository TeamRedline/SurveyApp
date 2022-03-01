package com.bilgeadam.service;

import com.bilgeadam.mapper.RequestMapper;
import com.bilgeadam.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ManagerSevice {

	private final ManagerRepository managerRepository;
	private final RequestMapper mapper;

}
