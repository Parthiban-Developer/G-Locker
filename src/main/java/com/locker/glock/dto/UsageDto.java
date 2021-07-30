package com.locker.glock.dto;


public class UsageDto {

	private Long id;

	private boolean isOpen;

	private String openTime;

	private String closeTime;

	private CustomerDto customer;

	private BookingDto booking;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public CustomerDto getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}

	public BookingDto getBooking() {
		return booking;
	}

	public void setBooking(BookingDto booking) {
		this.booking = booking;
	}
	
}