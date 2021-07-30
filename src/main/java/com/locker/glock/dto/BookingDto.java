package com.locker.glock.dto;

import java.sql.Timestamp;

public class BookingDto {

	private Long id;

	private String thirdPersonOTP;

	private String userMTP;

	private String bookingHrs;

	private String estimatedFair;

	private Timestamp bookingTime;

	private CustomerDto customer;

	private LockerRackerDto racker;

	private LockerDto locker;

	private ServiceDto service;

	private PaymentDto payment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getThirdPersonOTP() {
		return thirdPersonOTP;
	}

	public void setThirdPersonOTP(String thirdPersonOTP) {
		this.thirdPersonOTP = thirdPersonOTP;
	}

	public String getUserMTP() {
		return userMTP;
	}

	public void setUserMTP(String userMTP) {
		this.userMTP = userMTP;
	}

	public String getBookingHrs() {
		return bookingHrs;
	}

	public void setBookingHrs(String bookingHrs) {
		this.bookingHrs = bookingHrs;
	}

	public String getEstimatedFair() {
		return estimatedFair;
	}

	public void setEstimatedFair(String estimatedFair) {
		this.estimatedFair = estimatedFair;
	}

	public Timestamp getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Timestamp bookingTime) {
		this.bookingTime = bookingTime;
	}

	public CustomerDto getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}

	public LockerRackerDto getRacker() {
		return racker;
	}

	public void setRacker(LockerRackerDto racker) {
		this.racker = racker;
	}

	public LockerDto getLocker() {
		return locker;
	}

	public void setLocker(LockerDto locker) {
		this.locker = locker;
	}

	public ServiceDto getService() {
		return service;
	}

	public void setService(ServiceDto service) {
		this.service = service;
	}

	public PaymentDto getPayment() {
		return payment;
	}

	public void setPayment(PaymentDto payment) {
		this.payment = payment;
	}
	
}