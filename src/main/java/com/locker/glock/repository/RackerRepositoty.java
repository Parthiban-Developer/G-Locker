package com.locker.glock.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.locker.glock.entity.RackerEntity;

@Repository
public interface RackerRepositoty extends PagingAndSortingRepository<RackerEntity, Long> {

}
