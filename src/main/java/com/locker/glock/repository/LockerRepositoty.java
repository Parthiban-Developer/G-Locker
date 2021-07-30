package com.locker.glock.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.locker.glock.entity.LockerEntity;

@Repository
public interface LockerRepositoty extends CrudRepository<LockerEntity, Long> {

}
