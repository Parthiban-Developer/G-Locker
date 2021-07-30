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
import com.locker.glock.dto.LockerRackerDto;
import com.locker.glock.service.RackerService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/racker")
@Api(value = "Racker Details")
public class RackerController {

	@Autowired
	RackerService rackerService;

	Logger log = LoggerFactory.getLogger(RackerController.class);
	
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String ping() {
		return "Racker service is running, "+ System.currentTimeMillis();
	}

	/* Create new Racker */
	@RequestMapping(method = RequestMethod.POST)
	public ApiResponse create(@Valid @RequestBody LockerRackerDto rackerDto) {
		return rackerService.createRacker(rackerDto);
	}

	/* Update complete racker details by its ID */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ApiResponse update(@PathVariable Long id, @Valid @RequestBody LockerRackerDto rackerDto) {
		return rackerService.updateRackerById(id, rackerDto);
	}

	/* Get Racker by its id */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ApiResponse getById(@PathVariable Long id) {
		return rackerService.findById(id);
	}

	/* Get all the Racker as a list */
	@RequestMapping(method = RequestMethod.GET)
	public ApiResponse getRackerList() {
		return rackerService.getAllRackers();
	}

}
