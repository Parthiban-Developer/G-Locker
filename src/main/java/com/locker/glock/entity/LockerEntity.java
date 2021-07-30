package com.locker.glock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "locker")
@SequenceGenerator(name = "LOCKER_SEQ", initialValue = 100, allocationSize = 100)
public class LockerEntity extends DateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOCKER_SEQ")
	private Long id;

	@Column(name = "display_name")
	private String displayName;

	// 'Y' - Yes, 'N' - Not available, 'M' - Maintainance
	@Column(name = "is_available")
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
