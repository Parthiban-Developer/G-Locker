package com.locker.glock.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.locker.glock.dto.ApiResponse;
import com.locker.glock.dto.LockerDto;
import com.locker.glock.dto.LockerRackerDto;
import com.locker.glock.entity.RackerEntity;
import com.locker.glock.repository.RackerRepositoty;
import com.locker.glock.service.RackerService;
import com.locker.glock.utils.ObjectMapperUtils;

@Component
public class RackerServiceImpl implements RackerService {

	@Autowired
	RackerRepositoty rackerRepositoty;

	@Override
	public ApiResponse getAllRackers() {
		int respCode;
		String respMessage;
		List<RackerEntity> rackerListEntity = (List<RackerEntity>) rackerRepositoty.findAll();
		List<LockerRackerDto> rackerListDto = new ArrayList<>();
		if (rackerListEntity.size() > 0) {
			rackerListDto = ObjectMapperUtils.mapAll(rackerListEntity, LockerRackerDto.class);
			respMessage = "Success";
			respCode = 200;

		} else {
			respCode = 204;
			respMessage = "No content";
		}
		return new ApiResponse(respCode, respMessage, rackerListDto);
	}

	@Override
	public ApiResponse createRacker(LockerRackerDto rackerDto) {
		return saveRacker(rackerDto);
	}

	private ApiResponse saveRacker(LockerRackerDto rackerDto) {
		int respCode;
		String respMessage;
		Set<LockerDto> lockerList = rackerDto.getLockers();
		if (lockerList.size() < 1) {
			new ApiResponse(400, "Racker should have atleaset one Locker", null);
		}
		
		
		
		RackerEntity toSave = ObjectMapperUtils.map(rackerDto, RackerEntity.class);
		//setRackerIdInLocker();
		
		//lockerList.forEach(locker -> {locker.setRackerId();});
		
		RackerEntity rackerEntity = rackerRepositoty.save(toSave);

		LockerRackerDto toRet = null;
		if (rackerEntity != null) {
			toRet = ObjectMapperUtils.map(rackerEntity, LockerRackerDto.class);
			respMessage = "Success";
			respCode = 200;
		} else {
			respCode = 500;
			respMessage = "Unable to save";
		}
		return new ApiResponse(respCode, respMessage, toRet);
	}

	@Override
	public ApiResponse findById(Long id) {
		int respCode;
		String respMessage;
		LockerRackerDto toRet = null;
		Optional<RackerEntity> findById = rackerRepositoty.findById(id);
		if (!findById.isPresent()) {
			respMessage = "Racker is not available.";
			respCode = 404;
		} else {
			toRet = ObjectMapperUtils.map(findById.get(), LockerRackerDto.class);
			respMessage = "Success";
			respCode = 200;
		}
		return new ApiResponse(respCode, respMessage, toRet);
	}

	@Override
	public ApiResponse updateRackerById(Long id, LockerRackerDto rackerDto) {
		if (!rackerRepositoty.findById(id).isPresent()) {
			return new ApiResponse(400, "Bad Request", null);
		}
		return saveRacker(rackerDto);
	}
}
