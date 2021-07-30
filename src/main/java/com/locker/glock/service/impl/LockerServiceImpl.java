package com.locker.glock.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.locker.glock.dto.ApiResponse;
import com.locker.glock.dto.LockerDto;
import com.locker.glock.entity.LockerEntity;
import com.locker.glock.repository.LockerRepositoty;
import com.locker.glock.service.LockerService;
import com.locker.glock.utils.ObjectMapperUtils;

@Component
public class LockerServiceImpl implements LockerService {

	@Autowired
	LockerRepositoty rackerRepositoty;

	@Override
	public ApiResponse getAllLockers() {
		int respCode;
		String respMessage;
		List<LockerEntity> rackerListEntity = (List<LockerEntity>) rackerRepositoty.findAll();
		List<LockerDto> rackerListDto = new ArrayList<>();
		if (rackerListEntity.size() > 0) {
			rackerListDto = ObjectMapperUtils.mapAll(rackerListEntity, LockerDto.class);
			respMessage = "Success";
			respCode = 200;

		} else {
			respCode = 204;
			respMessage = "No content";
		}
		return new ApiResponse(respCode, respMessage, rackerListDto);
	}

	@Override
	public ApiResponse createLocker(LockerDto rackerDto) {
		return saveLocker(rackerDto);
	}

	private ApiResponse saveLocker(LockerDto rackerDto) {
		int respCode;
		String respMessage;

		LockerEntity toSave = ObjectMapperUtils.map(rackerDto, LockerEntity.class);

		LockerEntity rackerEntity = rackerRepositoty.save(toSave);

		LockerDto toRet = null;
		if (rackerEntity != null) {
			toRet = ObjectMapperUtils.map(rackerEntity, LockerDto.class);
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
		LockerDto toRet = null;
		Optional<LockerEntity> findById = rackerRepositoty.findById(id);
		if (!findById.isPresent()) {
			respMessage = "Bad Request";
			respCode = 400;
		} else {
			toRet = ObjectMapperUtils.map(findById.get(), LockerDto.class);
			respMessage = "Success";
			respCode = 200;
		}
		return new ApiResponse(respCode, respMessage, toRet);
	}

	@Override
	public ApiResponse updateLockerById(Long id, LockerDto rackerDto) {
		if (!rackerRepositoty.findById(id).isPresent()) {
			return new ApiResponse(400, "Bad Request", null);
		}
		return saveLocker(rackerDto);
	}
}