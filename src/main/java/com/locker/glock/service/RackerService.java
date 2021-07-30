package com.locker.glock.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.locker.glock.dto.ApiResponse;
import com.locker.glock.dto.LockerRackerDto;

@Service
public interface RackerService {

	public ApiResponse getAllRackers();

	public ApiResponse createRacker(@Valid LockerRackerDto rackerDto);

	public ApiResponse findById(Long id);

	public ApiResponse updateRackerById(Long id, LockerRackerDto rackerDto);
}
