package com.locker.glock.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.locker.glock.dto.ApiResponse;
import com.locker.glock.dto.LockerDto;

@Service
public interface LockerService {

	public ApiResponse getAllLockers();

	public ApiResponse createLocker(@Valid LockerDto lockerDto);

	public ApiResponse findById(Long id);

	public ApiResponse updateLockerById(Long id, LockerDto lockerDto);
}
