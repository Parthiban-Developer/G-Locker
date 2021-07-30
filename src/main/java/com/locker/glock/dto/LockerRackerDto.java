package com.locker.glock.dto;

import java.util.Set;

public class LockerRackerDto{

	private Long id;

	private String displayName;

	private String lat;
	
	private String lng;

	private char isAvailable;

	private String dimension;

	private String measurement;

	private Set<LockerDto> lockers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public char getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(char isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	public Set<LockerDto> getLockers() {
		return lockers;
	}

	public void setLockers(Set<LockerDto> lockers) {
		this.lockers = lockers;
	}
	
}
