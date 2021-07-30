package com.locker.glock.dto;

public class LockerDto {

	private Long id;

	private String displayName;

	private char isAvailable;

	private String dimension;

	private String measurement;

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
	
}
