package com.locker.glock.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "racker")
@SequenceGenerator(name="RACKER_SEQ", initialValue=100, allocationSize=100)
public class RackerEntity extends DateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="RACKER_SEQ")
	private Long id;

	@Column(name = "display_name")
	private String displayName;

	@NotNull
	private String lat;
	
	@NotNull
	private String lng;

	// 'Y' - Yes, 'N' - Not available, 'M' - Maintainance
	@Column(name = "is_available")
	private char isAvailable;

	private String dimension;

	private String measurement;
	
	private String address1;
	
	private String address2;

	@OneToMany(targetEntity = LockerEntity.class, cascade=CascadeType.ALL, orphanRemoval = true	)
	@JoinColumn(name = "racker_id", referencedColumnName = "id")
	private Set<LockerEntity> lockers;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<BookingEntity> bookings;

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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Set<LockerEntity> getLockers() {
		return lockers;
	}

	public void setLockers(Set<LockerEntity> lockers) {
		this.lockers = lockers;
	}

	public Set<BookingEntity> getBookings() {
		return bookings;
	}

	public void setBookings(Set<BookingEntity> bookings) {
		this.bookings = bookings;
	}
	
}
