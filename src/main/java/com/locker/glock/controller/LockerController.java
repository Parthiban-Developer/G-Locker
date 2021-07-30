package com.locker.glock.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.locker.glock.dto.ApiResponse;
import com.locker.glock.dto.LockerDto;
import com.locker.glock.service.LockerService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/locker")
@Api(value = "Locker Details")
public class LockerController {

	@Autowired
	LockerService lockerService;

	Logger log = LoggerFactory.getLogger(LockerController.class);
	
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String ping() {
		return "Locker service is running, "+ System.currentTimeMillis();
	}

	/* Create new locker */
	@RequestMapping(method = RequestMethod.POST)
	public ApiResponse create(@Valid @RequestBody LockerDto lockerDto) {
		return lockerService.createLocker(lockerDto);
	}

	/* Update complete locker details using its ID */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ApiResponse update(@PathVariable Long id, @Valid @RequestBody LockerDto lockerDto) {
		return lockerService.updateLockerById(id, lockerDto);
	}

	/* Get locker by its id */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ApiResponse getById(@PathVariable Long id) {
		return lockerService.findById(id);
	}

	/* Get all the locker as a list */
	@RequestMapping(method = RequestMethod.GET)
	public ApiResponse getLockerList() {
		return lockerService.getAllLockers();
	}
}
